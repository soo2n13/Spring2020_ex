package com.lee.spring.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.lee.spring.member.dao.MemberDao;
import com.lee.spring.member.dto.MemberDto;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDao dao;
	
	@Override
	public void addMember(MemberDto dto) {
		dao.insert(dto);
		
	}

	@Override
	public void updateMember(MemberDto dto) {
		dao.update(dto);
	}

	@Override
	public void deleteMember(int num) {
		dao.delete(num);
	}

	@Override
	public void getMember(int num, ModelAndView mView) {
		MemberDto dto=dao.getData(num);
		mView.addObject("dto",dto);
	}

	@Override
	public void getListMember(ModelAndView mView) {
		List<MemberDto> list=dao.getList();
		mView.addObject("list", list);
	}

}
