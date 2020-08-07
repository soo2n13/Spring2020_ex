package com.lee.spring02;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.RequestWrapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class FortuneController {
	
	@RequestMapping("/fortune.nhn")
	public String fortune(HttpServletRequest request,HttpServletResponse response) {
		String fortuneToday="동쪽으로 가면 귀인을 만나요.";
		
		request.setAttribute("fortune", fortuneToday);
		
		return "fortune";
	}
	
}
