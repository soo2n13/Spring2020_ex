package com.lee.spring.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lee.spring.todo.dto.TodoDto;
import com.lee.spring.todo.service.TodoService;

@Controller
public class TodoController {
	
	@Autowired
	private TodoService service;
	
	@RequestMapping("/todo/list")
	public ModelAndView list(ModelAndView mView) {
		
		List<TodoDto> list = service.getList();
		mView.addObject("list", list);
		mView.setViewName("todo/list");
	
		return mView;
	}
	
	@RequestMapping("/todo/info")
	public ModelAndView info(int num,ModelAndView mView) {
		
		TodoDto dto = service.getData(num);
		mView.addObject("dto", dto);
		mView.setViewName("todo/info");
	
		return mView;
	}
	
	@RequestMapping("/todo/insert")
	public ModelAndView insert(TodoDto dto, ModelAndView mView) {
		
		service.addData(dto);
		mView.setViewName("todo/insert");
	
		return mView;
	}
	
	@RequestMapping("/todo/addForm")
	public String addForm() {
		return "todo/addForm";
	}
	
	@RequestMapping("/todo/delete")
	public ModelAndView delete(int num, ModelAndView mView) {
		
		service.removeData(num);
		mView.setViewName("redirect:list.do");
		return mView;
	}
	
	@RequestMapping("/todo/update")
	public ModelAndView update(TodoDto dto, ModelAndView mView) {
		
		service.updateData(dto);
		mView.addObject("num", dto.getNum());
		mView.setViewName("todo/update");
		return mView;
	}
	
	@RequestMapping("/todo/updateForm")
	public ModelAndView updateForm(int num,ModelAndView mView) {
		
		TodoDto dto=service.getData(num);
		mView.addObject("dto", dto);
		mView.setViewName("todo/updateForm");
		return mView;
	}
}
