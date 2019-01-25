package com.SpringBootDemo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class MainControllerClass {
	@RequestMapping("home")
	public String hello(HttpServletRequest req,HttpServletResponse res){
		HttpSession session=req.getSession();
		String name=req.getParameter("name");
		session.setAttribute("name",name);
//		 System.out.println(req.getParameter("name"));
//		System.out.println("hi"+name);
		return "index";
	
	}
}
