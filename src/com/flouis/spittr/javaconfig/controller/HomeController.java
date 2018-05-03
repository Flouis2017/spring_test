package com.flouis.spittr.javaconfig.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;

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
		List<Map<String,String>> list = new ArrayList<Map<String,String>>();
		Map<String,String> map = new HashMap<String,String>();
		map.put("theme", "Daily Life");
		map.put("content", "asdfasdfqwerqwer");
		list.add(map);
		map = new HashMap<String,String>();
		map.put("theme", "Hobbies");
		map.put("content", "poiupioupoiupiou");
		list.add(map);
		System.out.println(list);
		String jsonListStr = JSONArray.fromObject(list).toString();
		System.out.println(jsonListStr);
		modelAndView.addObject("list",jsonListStr);
		return modelAndView;
	}
	
	@RequestMapping("/register")
	public String register(){
		return "register.jsp";
	}
}
