package com.flouis.spittr.javaconfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home(){
		return "home.html";
	}
	
	@RequestMapping("/spittles")
	public ModelAndView spittles(){
		ModelAndView modelAndView = new ModelAndView("spittles.jsp");
		modelAndView.addObject("titleName", "Welcome to Spittles");
		return modelAndView;
	}
	
	@RequestMapping("/register")
	public String register(){
		return "register.jsp";
	}
}
