package com.lee.spring.member.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lee.spring.member.dto.MemberDto;

public interface MemberDao {
	public void insert(MemberDto dto);
	public void update(MemberDto dto);
	public void delete(int num);
	public MemberDto getData(int num);
	public List<MemberDto> getList();
}
