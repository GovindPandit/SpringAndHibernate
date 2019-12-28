package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.model.User;
import com.sun.org.apache.bcel.internal.generic.NEW;

@Controller
public class IndexController 
{
	@RequestMapping(value = {"/home","/"})
	public String m1()
	{
		return "index";
	}
	
	@RequestMapping("/register")
	public String m3(ModelMap map)
	{
		map.addAttribute("user",new User());
		return "register";
	}
	
	@RequestMapping("/login")
	public String m4()
	{
		return "login";
	}
}
