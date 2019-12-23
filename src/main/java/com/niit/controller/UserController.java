package com.niit.controller;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.dbconfig.DbConfig;
import com.niit.model.User;
import com.niit.operations.UserOperations;

@Controller
@RequestMapping("/user")
public class UserController
{
	
	UserOperations uo=new UserOperations();
	
//	@RequestMapping("/adduser")
//	public String addUser(@RequestParam("username") String username,@RequestParam("email") String email,
//			@RequestParam("password") String password)
//	{
//		User u=new User();
//		u.setUsername(username);
//		u.setEmail(email);
//		u.setPassword(password);
//		add(u);
//		return "redirect:/home";
//		
//		
//		
//		
//	}
	
	@RequestMapping("/display{userid}")
	public String displayUser(@PathVariable("userid") int userid,ModelMap map)
	{
		User u=uo.displaybyid(userid);
		map.addAttribute("u",u);
		return "user";
	}
	
	@RequestMapping("/update")
	public String updateUser(@ModelAttribute("u") User u)
	{
		System.out.println(u.getEmail());
		uo.update(u);
		return "redirect:/user/display";
	}
	
	@RequestMapping("/add")
	public String addUser(@ModelAttribute("user") User user)
	{
		uo.add(user);
		return "redirect:/home";
	}
	
	@RequestMapping("/display")
	public String displayUsers(ModelMap map)
	{
		map.addAttribute("usrs",uo.display());
		return "users";
	}
	
	@RequestMapping("delete{userid}")
	public String deleteUser(@PathVariable("userid") int userid)
	{
		uo.delete(userid);
		return "redirect:/user/display";
	}
	
	@RequestMapping("edit{userid}")
	public String editUser(@PathVariable("userid") int userid,ModelMap map)
	{
		User user=uo.displaybyid(userid);
		map.addAttribute("u",user);
		return "register";
	}
}
