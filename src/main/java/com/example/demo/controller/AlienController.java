package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;

@Controller
public class AlienController {
	@Autowired
	AlienRepo repo;
	
	 	@RequestMapping("home")
	public String home()
	{
		return "home.jsp";
	}
	@RequestMapping("/addAlien")

	 	public String addAlien(Alien alien) // collecting the user data 
		{
	 		repo.save(alien);
			return "home.jsp";
		}
		

}
