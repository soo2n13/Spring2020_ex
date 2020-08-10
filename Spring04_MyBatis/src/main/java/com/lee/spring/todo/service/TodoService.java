package com.lee.spring.todo.service;

import java.util.List;

import com.lee.spring.todo.dto.TodoDto;

public interface TodoService {
	public void addData(TodoDto dto);
	public void removeData(int num);
	public void updateData(TodoDto dto);
	public TodoDto getData(int num);
	public List<TodoDto> getList();
}
