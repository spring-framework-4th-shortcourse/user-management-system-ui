package com.kshrd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PageController {

	@GetMapping("/login")
	public String login(){
		return "/login";
	}
	
	@GetMapping(value = {"/", "/user"})
	public String userHomePage(){
		return "/user/user";
	}
	
	@GetMapping("/user/create")
	public String createUserPage(){
		return "/user/adduser";
	}
	
	@GetMapping("/user/detail/{id}")
	public String userDetailPage(@PathVariable Integer id, Model model){
		model.addAttribute("id", id);
		return "/user/user-detail";
	}
	
}
