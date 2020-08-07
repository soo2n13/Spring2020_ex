package com.lee.spring.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.lee.spring.member.dto.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao {

	@Autowired
	private SqlSession session;
	
	@Override
	public void insert(MemberDto dto) {
		/*
		 * mapper namespace: member
		 * sql id: insert
		 * parameterType: MemberDto
		 */
		session.insert("member.insert", dto);
	}

	@Override
	public void update(MemberDto dto) {
		// TODO Auto-generated method stub
		session.update("member.update", dto);
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		session.delete("member.delete", num);
	}

	@Override
	public MemberDto getData(int num) {
		// TODO Auto-generated method stub
		MemberDto dto = session.selectOne("member.getData", num);
		return dto;
	}

	@Override
	public List<MemberDto> getList() {
		/*
		 * resultType: MemberDto
		 * -resultType은 select된 row 하나를 
		 */
		List<MemberDto> list = session.selectList("member.getList");
		return list;
	}
	
}
