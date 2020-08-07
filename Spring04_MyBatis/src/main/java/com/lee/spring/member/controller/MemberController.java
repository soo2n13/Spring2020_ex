package com.lee.spring.member.controller;

import java.util.List;

import javax.xml.ws.RequestWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lee.spring.member.dao.MemberDao;
import com.lee.spring.member.dto.MemberDto;
import com.lee.spring.member.service.MemberService;

@Controller
public class MemberController {
	//의존객체를 주입
	@Autowired
	private MemberService service;
	
	@RequestMapping("/member/list")
	public ModelAndView insert(ModelAndView mView) {
		
		service.getListMember(mView);;
		mView.setViewName("member/list");
	
		return mView;
	}
	
	@RequestMapping("/member/insertform")
	public String insertform() {
		return "member/insertform";
	}
	
	@RequestMapping("/member/insert")
	public ModelAndView insert(MemberDto dto,ModelAndView mView) {
		service.addMember(dto);
		
		mView.addObject("name", dto.getName());
		mView.setViewName("member/insert");
		
		return mView;
	}
	
	@RequestMapping("/member/updateform")
	public ModelAndView updateform(int num, ModelAndView mView) {
		service.getMember(num, mView);
		mView.setViewName("member/updateform");
		
		return mView;
	}
	
	@RequestMapping(value ="/member/update", method = RequestMethod.POST)
	public ModelAndView update(MemberDto dto,ModelAndView mView) {
		service.updateMember(dto);
		
		mView.addObject("name", dto.getName());
		mView.setViewName("member/update");
		
		return mView;
	}
	
	@RequestMapping("/member/delete")
	public ModelAndView delete(int num,ModelAndView mView) {
		
		service.deleteMember(num);
		mView.setViewName("redirect:list.do");
		
		return mView;
	}
}
