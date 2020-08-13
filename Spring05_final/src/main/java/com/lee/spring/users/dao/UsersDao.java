package com.lee.spring.users.dao;

import com.lee.spring.users.dto.UsersDto;

public interface UsersDao {
	public boolean isExist(String inputId);
	public void addUser(UsersDto dto);
}
