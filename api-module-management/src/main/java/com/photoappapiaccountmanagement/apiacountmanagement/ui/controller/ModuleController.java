package com.photoappapiaccountmanagement.apiacountmanagement.ui.controller;

import com.photoappapiaccountmanagement.apiacountmanagement.domaine.Module;
import com.photoappapiaccountmanagement.apiacountmanagement.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/module")
public class ModuleController {

    @Autowired
    private ModuleService moduleService;

    @GetMapping(value = "/list")
    public List<Module> status(){
        return moduleService.listAll();
    }


}
