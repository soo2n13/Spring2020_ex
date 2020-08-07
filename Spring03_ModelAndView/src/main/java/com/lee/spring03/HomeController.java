package com.lee.spring03;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;	
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * component scan 했을 때 homeController 객체가 생성되고 spring이 관리
 * spring이 관리한다는 의미는 spring bean 컨테이너에서 관리되는 객체가 된다는 것.
 */
@Controller
public class HomeController {
	/**
	 * home.do 요청이 왔을때, 이 메소드로 요청을 처리하게 됨.
	 */
	@RequestMapping("/home")
	public String home(HttpServletRequest request,HttpServletResponse response) {
		
		List<String> noticeList=new ArrayList<String>();
		noticeList.add("장마철이네요.");
		noticeList.add("어쩌구..");
		noticeList.add("저쩌구..");
		
		request.setAttribute("noticeList", noticeList);
		
		
		/**
		 * 리턴하는 문자열은 view 페이지의 위치를 알려주는 것.
		 * "/WEB-INF/views/"+"home"+".jsp" 
		 */
		return "home";
	}
	
}
