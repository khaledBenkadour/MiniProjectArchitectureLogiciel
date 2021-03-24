package com.photoappapiaccountmanagement.apiacountmanagement.ui.controller;
import com.photoappapiaccountmanagement.apiacountmanagement.domaine.Enseignant;
import com.photoappapiaccountmanagement.apiacountmanagement.service.EnseignantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/enseignant")
public class ModuleController {

    @Autowired
    private EnseignantService moduleService;

    @GetMapping(value = "/list")
    public List<Enseignant> status(){
        return moduleService.listAll();
    }


}
