package com.lee.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class XmlTestController {
	
	@RequestMapping("/xml01")
	public String xml01() {
		
		return "xml01";
	}
	
	@RequestMapping("/xml02")
	@ResponseBody
	public Data xml02() {
		Data d=new Data();
		d.setNum(1);
		d.setName("lee");
		
		return d;
	}
	
	@RequestMapping("/xml03")
	@ResponseBody
	public HobbyList xml03() {
		List<String> hobby=new ArrayList<String>();
		
		hobby.add("java");
		hobby.add("jsp");
		hobby.add("spring");
		
		HobbyList list=new HobbyList();
		list.setHobby(hobby);
		
		return list;
	}
}
