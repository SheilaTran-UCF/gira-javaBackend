package javabackend.gira.welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // return Json
public class WelcomeController {
	@GetMapping("/welcome")
	public Object welcome() {
		return "Welcome to Gira Application.";
	}
}