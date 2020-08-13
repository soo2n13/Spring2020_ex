package com.lee.spring.users.service;

import java.util.Map;

import com.lee.spring.users.dto.UsersDto;

public interface UsersService {
	public Map<String , Object> isExisted(String inputId);
	public void addUser(UsersDto dto);
}
