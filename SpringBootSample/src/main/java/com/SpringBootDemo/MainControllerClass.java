package com.SpringBootDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainControllerClass {
	@RequestMapping("home")
	public String hello(){
		System.out.println("hello");
		return "index.jsp";
	}
}
