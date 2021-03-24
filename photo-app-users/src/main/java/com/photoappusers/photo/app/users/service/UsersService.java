package com.photoappusers.photo.app.users.service;
import com.photoappusers.photo.app.users.shared.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UsersService extends UserDetailsService {

    UserDto createUser(UserDto userDetails);
    UserDto getUserDetailsByEmail(String email);

}
