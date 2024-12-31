package primeiro.projeto.projeto1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import primeiro.projeto.projeto1.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
			
	@GetMapping("/user")
	public String getUsers(Model model) {
		model.addAttribute("userstList", this.userService.findAll());
		
		return "user";
	}
}
