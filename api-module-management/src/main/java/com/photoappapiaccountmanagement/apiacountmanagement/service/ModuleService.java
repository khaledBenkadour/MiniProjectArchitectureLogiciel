package com.photoappapiaccountmanagement.apiacountmanagement.service;
import com.photoappapiaccountmanagement.apiacountmanagement.domaine.Module;
import com.photoappapiaccountmanagement.apiacountmanagement.repository.ModuleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class ModuleService {

    @Autowired
    private ModuleDao moduleDao;

    public List<Module> listAll() {
        return moduleDao.findAll();
    }

}
