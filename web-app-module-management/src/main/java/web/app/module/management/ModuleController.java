package web.app.module.management;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModuleController {

	@Autowired
	private ModuleService service;

	@RequestMapping("/")
	public String homePage() {
		return "home";
	}

	@GetMapping("/index")
	public String viewHomePage(Model model) {
		List<Module> listModule = service.listAll();
		model.addAttribute("listModule", listModule);
		
		return "modules";
	}
	
	@RequestMapping("/new")
	public String showNewModuletPage(Model model) {
		Module module = new Module();
		model.addAttribute("module", module);
		
		return "newModule";
	}
	
	@RequestMapping(value = "/save")
	public String saveModule(@ModelAttribute("module") Module module) {
		service.save(module);
		return "redirect:/index";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditModulePage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("editModule");
		Module module = service.get(id);
		mav.addObject("module", module);
		return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteModule(@PathVariable(name = "id") int id) {
		service.delete(id);
		return "redirect:/index";
	}
}
