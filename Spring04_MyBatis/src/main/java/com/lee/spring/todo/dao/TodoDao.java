package com.lee.spring.todo.dao;

import java.util.List;

import com.lee.spring.todo.dto.TodoDto;

public interface TodoDao {
	public void insert(TodoDto dto);
	public void delete(int num);
	public void update(TodoDto dto);
	public TodoDto getData(int num);
	public List<TodoDto> getList();
	
	
}
