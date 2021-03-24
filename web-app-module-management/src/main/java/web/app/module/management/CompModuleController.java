package web.app.module.management;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/compmodule")
public class CompModuleController {

    @Autowired
    private CompModuleService compModuleRepository;

    @GetMapping("/index")
    public String viewHomePage(Model model) {
        List<CompModule> listCompModule = compModuleRepository.listAll();
        model.addAttribute("listCompModule", listCompModule);

        return "compModules";
    }

    @RequestMapping("/new")
    public String showNewModuletPage(Model model) {
        CompModule compModule = new CompModule();
        model.addAttribute("compModule", compModule);

        return "newCompModule";
    }

    @RequestMapping(value = "/save")
    public String saveModule(@ModelAttribute("compmodule") CompModule compModule) {
        compModuleRepository.save(compModule);

        return "redirect:/compmodule/index";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditModulePage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("editCompModule");
        CompModule compModule = compModuleRepository.get(id);
        mav.addObject("compModule", compModule);
        return mav;
    }

    @RequestMapping("/delete/{id}")
    public String deleteModule(@PathVariable(name = "id") int id) {
        compModuleRepository.delete(id);
        return "redirect:/compmodule/index";
    }

}
