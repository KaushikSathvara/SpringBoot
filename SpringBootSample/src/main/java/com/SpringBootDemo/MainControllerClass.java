package com.SpringBootDemo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.regDAO.Alien;



@Controller
public class MainControllerClass {
	@RequestMapping("home")
	public ModelAndView hello(Alien alien){
		ModelAndView mv=new ModelAndView();
		
		mv.addObject(alien);
		mv.setViewName("index");
		
		return mv;
	
	}
}
