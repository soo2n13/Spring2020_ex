package com.lee.spring.todo.dto;

public class TodoDto {
	private int num;
	private String name;
	private String content;
	
	public TodoDto(int num, String name, String content) {
		this.num = num;
		this.name = name;
		this.content = content;
	}
	
	public TodoDto() {
		this(0,null,null);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
