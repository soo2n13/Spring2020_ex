package com.lee.spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lee.spring.member.dto.MemberDto;

@Controller
public class JSONTestController {
	
	@RequestMapping("/json1")
	public String json1() {
		
		
		return "json1";
	}
	
	@RequestMapping(value="/json2", method=RequestMethod.GET,
			produces="application/json; charset=utf-8")
	@ResponseBody  // 리턴하는 문자열을 클라이언트에 출력하겠다는 의미
	public String json2() {
		return "{\"num\":1,\"name\":\"lee\"}";
	}
	/**
	 * 1.jsckson-databind 라이브러리가 dependency에 명시가 되어있고
	 * 2.servlet-context.xml에 <mvc:annotation-driven /> 이 명시 되어있고,
	 * 3.컨트롤러의 메소드에 @ResponseBody 
	 * 
	 * @return
	 */
	
	@RequestMapping("/json3")
	@ResponseBody
	public Map<String, Object> json3() {   // 맵 또는 리스트로 리턴 시 , json 형식으로 출력
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("num", 1);
		map.put("name", "김구라");
		map.put("isMan",true);
		
		return map;
	}
	
	@RequestMapping("/json4")
	@ResponseBody
	public List<String> json4() {   // 맵 또는 리스트로 리턴 시 , json 형식으로 출력
		List<String> list=new ArrayList<String>();
		list.add("김구라");
		list.add("해골");
		list.add("원숭이");
		
		return list;
	}
	
	@RequestMapping("/json5")
	@ResponseBody
	public Map<String,Object> json5() { 
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("email", "aaa@naver.com");
		
		List<String> hobby=new ArrayList<String>();
		hobby.add("java");
		hobby.add("jsp");
		hobby.add("spring");
		
		map.put("hobby", hobby);
		return map;
	}
	
	@RequestMapping("/json6")
	@ResponseBody
	public List<Map<String, Object>> json6() { 
		
		Map<String, Object> map1=new HashMap<String, Object>();
		map1.put("num",1);
		map1.put("name", "김구라");
		
		Map<String, Object> map2=new HashMap<String, Object>();
		map2.put("num",2);
		map2.put("name", "해골");
		
		Map<String, Object> map3=new HashMap<String, Object>();
		map3.put("num",3);
		map3.put("name", "lee");
		
		List<Map<String, Object>> list=new ArrayList<Map<String,Object>>();
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		
		
		
		return list;
	}
	
	@RequestMapping("/json7")
	@ResponseBody
	public MemberDto json7() { 
		
		MemberDto dto=new MemberDto(1,"김구라","노량진");
		
		return dto;
	}
	
	@RequestMapping("/json8")
	@ResponseBody
	public List<MemberDto> json8() { 
		
		List<MemberDto> list=new ArrayList<MemberDto>();
		
		MemberDto dto1=new MemberDto(1, "lee", "seoul");
		MemberDto dto2=new MemberDto(2, "kim", "sejong");
		MemberDto dto3=new MemberDto(3, "bak", "busan");
		
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		
		return list;
	}
}
