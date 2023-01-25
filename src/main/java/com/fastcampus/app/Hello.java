package com.fastcampus.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {

	@RequestMapping("/hello")
	public void main() {
		System.out.println("Hellos");
	}
}
