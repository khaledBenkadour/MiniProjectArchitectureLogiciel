package web.app.module.management;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ModuleService {

	@Autowired
	private ModuleRepository repository;
	
	public List<Module> listAll() {
		return repository.findAll();
	}
	
	public void save(Module module) {
		repository.save(module);
	}
	
	public Module get(long id) {
		return repository.findById(id).get();
	}
	
	public void delete(long id) {
		repository.deleteById(id);
	}
}
