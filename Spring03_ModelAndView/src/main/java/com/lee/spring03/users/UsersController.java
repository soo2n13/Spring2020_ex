package com.lee.spring03.users;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsersController {
	@RequestMapping("/users/signup_form")
	public String signupForm() {
		
		
		return "users/signup_form";
	}
	
	@RequestMapping("/users/signup")
	public String signup(HttpServletRequest request) {
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		
		request.setAttribute("id", id);
		
		System.out.println(id+" | "+pwd);
		return "users/signup";
	}
	
	@RequestMapping("/users/signup2")
	public String signup(@RequestParam String id,@RequestParam String pwd) {
		/**
		 * @RequestParam 이노테이션과 함께 메소드의 인자를 선언시,
		 * 요청 파라미터가 자동 추출되어 저장
		 * 
		 * @RequestParam은 생략 가능
		 * form요소의 name속성과 지역변수명이 같아야함.(자동 추출시에 cast된 타입으로 자동 저장)
		 */
		System.out.println(id+" | "+pwd);
		
		return "users/signup";
	}
	
	@RequestMapping("/users/signup3")
	public String signup(@ModelAttribute UsersDto dto) {
		/**
		 * @RequestParam 이노테이션과 함께 메소드의 인자를 선언시,
		 * 요청 파라미터가 자동 추출되어 저장
		 * 
		 * @RequestParam은 생략 가능
		 * form요소의 name속성과 지역변수명이 같아야함.(자동 추출시에 cast된 타입으로 자동 저장)
		 */
		System.out.println(dto.getId()+" | "+dto.getPwd());
		
		return "users/signup";
	}
}
