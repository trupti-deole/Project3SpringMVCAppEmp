package com.test.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.binding.Student;
@Controller
public class WelcomeController {
	@RequestMapping(value="/")
	public String LandingPage()
	{
		return "index";
	}
	@RequestMapping(value = "/welcome")
	public String welcomePage() {
		return "welcome";
	}

	@RequestMapping(value="/log")
	public String logPage()
	{
		return "login";
	}
	@RequestMapping(value="/login")
	public String loginPage(@RequestParam String uname,@RequestParam String pwd)
	{
		if(uname.equalsIgnoreCase("cjc")&&pwd.equals("cjc123"))
		{
			System.out.println("Login Successfully");
			System.out.println("Username:"+uname+"Password:"+pwd);
//			return "success";
		}
		return "index";
	}
	@RequestMapping(value="/reg")
	public String regPage()
	{
		return "register";
	}
	@RequestMapping(value="/register")
	public String registerPage(@ModelAttribute Student stud,ModelMap m)
	{
		System.out.println("Student Details");
		System.out.println(stud.getUname());
		System.out.println(stud.getPwd());
		System.out.println(stud.getFname());
		System.out.println(stud.getEmail());
		System.out.println(stud.getMobno());
		//add data in modelmap m
//		m.addAttribute("data",stud.getUname());
		m.addAttribute("data",stud);
		return "success";
	}
	
}
