package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.DAO.userDAO;
import com.niit.model.User;


@Controller
public class mainController {
	
	@Autowired
	private userDAO userdao;
	
	@RequestMapping("/")
	public String _default(){
		return "index";
	}
	
	@ModelAttribute("register")
	public User getUserView(){
		return new User();
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String getRegister(@ModelAttribute("register")User user,BindingResult result){
		
		userdao.save(user);
		
		return "register";	
		}
	}
	


