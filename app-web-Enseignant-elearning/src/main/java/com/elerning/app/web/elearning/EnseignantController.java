package com.elerning.app.web.elearning;
import java.util.List;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;import org.springframework.stereotype.Controller;import org.springframework.ui.Model;import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class EnseignantController {
	@Autowired
	private EnseignantUserRepository userRepo;

	@GetMapping("")
	public String homePage() {
		return "home";
	}

	@GetMapping("/index")
	public String viewHomePage() {
		return "index";
	}
	
	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new Enseignant());
		return "signup_form";
	}
	
	@PostMapping("/process_register")
	public String processRegister(Enseignant enseignant) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(enseignant.getPassword());
		enseignant.setPassword(encodedPassword);
		userRepo.save(enseignant);
		return "register_success";
	}

	@GetMapping("/users")
	public String listUsers(Model model) {
		List<Enseignant> listUsers = userRepo.findAll();
		model.addAttribute("listUsers", listUsers);
		
		return "users";
	}
}
