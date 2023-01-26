package com.fastcampus.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {
	
	@RequestMapping("register")
	public String register() {
		return"registerForm";
	}
	
	@RequestMapping("register/save")
	public String save() {
		
		return "registerInfo";
	}

}
