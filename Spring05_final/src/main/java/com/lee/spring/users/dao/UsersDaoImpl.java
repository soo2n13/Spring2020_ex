package com.lee.spring.users.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lee.spring.users.dto.UsersDto;

@Repository
public class UsersDaoImpl implements UsersDao {

	@Autowired
	private SqlSession session;
	
	@Override
	public boolean isExist(String inputId) {
		// TODO Auto-generated method stub
		String id=session.selectOne("users.isExist", inputId);
		
		if(id == null) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public void addUser(UsersDto dto) {
		// TODO Auto-generated method stub
		session.insert("users.insert", dto);
	}

}
