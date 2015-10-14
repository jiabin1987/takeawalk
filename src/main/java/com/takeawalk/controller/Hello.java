package com.takeawalk.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello (HttpServletRequest request, HttpServletResponse response) {
		
//		String basePath = request.getSession().getServletContext().getRealPath("/");
//		
//		try {
//			new VoleTemplate(basePath,"hello.vm", response.getOutputStream());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		return "hello";
	}

}
