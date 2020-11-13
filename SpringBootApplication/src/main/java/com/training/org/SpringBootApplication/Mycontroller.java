package com.training.org.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mycontroller {
	
	@RequestMapping("/sigin")
	public String signIn(Model model) {
		user use = new user();
		model.addAttribute("user", use);
		return "sigin";
	}
	
	@RequestMapping("/result")
	public String result(@ModelAttribute("user1") user myUser) {
		
		
		return "result";
	}
	@RequestMapping("/signup")
	public String signUp() {
		return "signup";
	}

}
