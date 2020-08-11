package com.lee.spring;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileTestController {
	
	@RequestMapping("/upload")
	public String upload(@RequestParam MultipartFile myFile, HttpServletRequest request) {
		
		//원본 파일명
		String orgFileName=myFile.getOriginalFilename();
		//파일 크기
		long fileSize=myFile.getSize();
		// webapp/upload 폴더까지의 실제경로
		String realPath=request.getServletContext().getRealPath("/upload");
		//저장할 파일의 상세 경로
		String filePath=realPath+File.separator;
		//디렉토리를 만들 파일 객체 생성
		File upload=new File(filePath);
		if(!upload.exists()) {
			upload.mkdir();
		}
		String saveFileName=System.currentTimeMillis()+orgFileName;
		
		try {
			myFile.transferTo(new File(filePath+saveFileName));
			System.out.println(filePath+saveFileName);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		request.setAttribute("orgFileName",orgFileName);
		request.setAttribute("saveFileName",saveFileName);
		request.setAttribute("fileSize",fileSize);
		
		
		return "upload";
	}
}
