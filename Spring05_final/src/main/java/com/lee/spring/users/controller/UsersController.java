package com.lee.spring.users.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lee.spring.users.dto.UsersDto;
import com.lee.spring.users.service.UsersService;

@Controller
public class UsersController {
	@Autowired
	private UsersService service;
	
	@RequestMapping("users/signup_form")
	public String signupForm() {
		return "users/signup_form";
	}
	
	@RequestMapping("/users/checkid")
	@ResponseBody
	public Map<String, Object> checkid(@RequestParam String inputId) {
		return service.isExisted(inputId);
	}
	
	@RequestMapping("/users/signup")
	public ModelAndView signup(UsersDto dto, ModelAndView mView) {
		
		mView.setViewName("users/signup");
		return mView;
	}
}
