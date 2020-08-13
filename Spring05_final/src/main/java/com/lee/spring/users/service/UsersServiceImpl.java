package com.lee.spring.users.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lee.spring.users.dao.UsersDao;
import com.lee.spring.users.dto.UsersDto;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersDao dao;
	@Override
	public Map<String, Object> isExisted(String inputId) {
		// TODO Auto-generated method stub
		boolean isExist=dao.isExist(inputId);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("isExist", isExist);
		return map;
	}
	@Override
	public void addUser(UsersDto dto) {
		// TODO Auto-generated method stub
		
		
	}

}
