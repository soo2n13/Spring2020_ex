package com.lee.spring.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lee.spring.member.dao.MemberDao;
import com.lee.spring.member.dto.MemberDto;

@Controller
public class MemberController {
	//의존객체를 주입
	@Autowired
	private MemberDao dao;
	
	@RequestMapping("/member/list")
	public ModelAndView insert(ModelAndView mView) {
		
		List<MemberDto> list=dao.getList();
		
		mView.addObject("list", list);
		
		mView.setViewName("member/list");
	
		return mView;
	}
}
