package com.photoappusers.photo.app.users.controller;
import com.photoappusers.photo.app.users.service.UsersService;
import com.photoappusers.photo.app.users.shared.UserDto;
import com.photoappusers.photo.app.users.ui.model.CreateUserRequestModel;
import com.photoappusers.photo.app.users.ui.model.CreateUserResponseModel;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/users")
public class UsersControllers {

    @Autowired
    private Environment environment;

    @Autowired
    UsersService usersService;

    @GetMapping("/status/check")
    public String status(){
        return "working USERS Services on port..." + environment.getProperty("local.server.port") + " ,With Token = " + environment.getProperty("token.secret");
    }

    @PostMapping(
            consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}
            )
    public ResponseEntity<CreateUserResponseModel> createUser(@RequestBody CreateUserRequestModel userDetails){
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        UserDto userDto = modelMapper.map(userDetails, UserDto.class);
        UserDto createUser = usersService.createUser(userDto);

        CreateUserResponseModel returnValue = modelMapper.map(createUser, CreateUserResponseModel.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(returnValue);
    }



}
