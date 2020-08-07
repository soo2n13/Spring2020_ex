package com.lee.spring.member.service;

import org.springframework.web.servlet.ModelAndView;

import com.lee.spring.member.dto.MemberDto;

public interface MemberService {
	public void addMember(MemberDto dto);
	public void updateMember(MemberDto dto);
	public void deleteMember(int num);
	public void getMember(int num,ModelAndView mView);
	public void getListMember(ModelAndView mView);
}
