package com.ecom.powercart1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ecom.powercart1.daotemp.UserDAO;


@Controller
public class MainController {
	@RequestMapping("/")
	
   public String homepage()
	{
		return "home";
	}
	@RequestMapping("/login")
	 public ModelAndView showloginpage()
	 {
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("message","you clicked login link");
		mv.addObject("showloginpage","true");
		return mv;	
	 }
	
	@RequestMapping("/register")
	
	 public ModelAndView showregisterpage()
	 {
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("message","you clicked register link");
		mv.addObject("showregisterpage","true");
		return mv;	
	 }
	@RequestMapping("/validate")
	 public ModelAndView validate(@RequestParam("id") String id,@RequestParam("password") String password )
	 {
	
		System.out.println("validate");
		System.out.println("id" +id);
		System.out.println("password" +password);
		ModelAndView mv=new ModelAndView("home");
		
	 
	UserDAO userDAO= new UserDAO();
		
		if(userDAO.isValidCredentials(id,password)==true)
		{
			mv.addObject("successmsg","you logged in successfully");
		}
		else
		{
			mv.addObject("errormsg","invalid credentials please try again");
		}
		return mv;
	 }
	
}
