package com.photoappapiaccountmanagement.apiacountmanagement.service;

import com.photoappapiaccountmanagement.apiacountmanagement.domaine.Enseignant;
import com.photoappapiaccountmanagement.apiacountmanagement.repository.EnseignantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EnseignantService {

    @Autowired
    private EnseignantDao enseignantDao;

    public List<Enseignant> listAll() {
        return enseignantDao.findAll();
    }

}
