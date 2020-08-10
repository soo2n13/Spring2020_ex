package com.lee.spring;

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
}
