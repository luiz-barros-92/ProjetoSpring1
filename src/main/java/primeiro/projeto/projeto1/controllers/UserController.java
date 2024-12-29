package primeiro.projeto.projeto1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import primeiro.projeto.projeto1.repository.RepositorioDeUsuario;

@Controller
public class UserController {
	
	private RepositorioDeUsuario repositorioDeUsuario;
	
	public UserController(RepositorioDeUsuario repositorioDeUsuario) {
		this.repositorioDeUsuario = repositorioDeUsuario;
	}
	
	@GetMapping("/user")
	public String getUsers(Model model) {
		model.addAttribute("userstList", this.repositorioDeUsuario.findAll());
		
		return "user";
	}
}
