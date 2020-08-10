package com.lee.spring.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lee.spring.todo.dao.TodoDaoImpl;
import com.lee.spring.todo.dto.TodoDto;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoDaoImpl dao;
	
	@Override
	public void addData(TodoDto dto) {
		// TODO Auto-generated method stub
		dao.insert(dto);
	}

	@Override
	public void removeData(int num) {
		// TODO Auto-generated method stub
		dao.delete(num);
	}

	@Override
	public void updateData(TodoDto dto) {
		// TODO Auto-generated method stub
		dao.update(dto);
	}

	@Override
	public TodoDto getData(int num) {
		// TODO Auto-generated method stub
		TodoDto dto=dao.getData(num);
		return dto;
	}

	@Override
	public List<TodoDto> getList() {
		// TODO Auto-generated method stub
		List<TodoDto> list=dao.getList();
		return list;
	}

}
