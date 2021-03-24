package com.photoappapiaccountmanagement.apiacountmanagement.repository;
import com.photoappapiaccountmanagement.apiacountmanagement.domaine.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ModuleDao extends JpaRepository<Module, Long> {

}
