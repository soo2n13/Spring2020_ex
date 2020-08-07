package com.lee.spring03;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;	
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * component scan 했을 때 homeController 객체가 생성되고 spring이 관리
 * spring이 관리한다는 의미는 spring bean 컨테이너에서 관리되는 객체가 된다는 것.
 */
@Controller
public class FriendsController {
	/**
	 * home.do 요청이 왔을때, 이 메소드로 요청을 처리하게 됨.
	 */
	@RequestMapping("/friends")
	public String friends(HttpServletRequest request,HttpServletResponse response) {
		
		List<String> friendList=new ArrayList<String>();
		friendList.add("lee");
		friendList.add("kim");
		friendList.add("bak");
		
		request.setAttribute("friendList", friendList);
		
		
		/**
		 * 리턴하는 문자열은 view 페이지의 위치를 알려주는 것.
		 * "/WEB-INF/views/"+"home"+".jsp" 
		 */
		return "friends";
	}
	
	@RequestMapping("/friends2")
	public ModelAndView friends2() {
		
		List<String> friendList=new ArrayList<String>();
		friendList.add("lee");
		friendList.add("kim");
		friendList.add("bak");
		
		ModelAndView mView=new ModelAndView();
		// request영역에 담을 내용을 .addObject() 메소드를 이용해 담음.
		mView.addObject("friendList",friendList);
		// view 페이지의 정보를 .setViewName() 메소드를 이용해 전달
		mView.setViewName("friends");
		
		//model과 view 정보를 가지고 있는 mView 객체 반환
		return mView;
	}
	
	@RequestMapping("/delete")
	public String delete() {
		
		System.out.println("친구 정보를 삭제합니다.");
		//redirect식으로 이동
		return "redirect:/friends.do";
	}
	
	@RequestMapping("/delete2")
	public ModelAndView delete2(ModelAndView mView) {
		
		System.out.println("친구 정보를 삭제합니다.");
		
		mView.setViewName("redirect:friends.do");
		
		return mView;
	}
}
