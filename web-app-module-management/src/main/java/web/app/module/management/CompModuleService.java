package web.app.module.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CompModuleService {

    @Autowired
    private CompModuleRepository compModuleRepository;


    public List<CompModule> listAll() {
        return compModuleRepository.findAll();
    }

    public void save(CompModule module) {
        compModuleRepository.save(module);
    }

    public CompModule get(long id) {
        return compModuleRepository.findById(id).get();
    }

    public void delete(long id) {
        compModuleRepository.deleteById(id);
    }

}
