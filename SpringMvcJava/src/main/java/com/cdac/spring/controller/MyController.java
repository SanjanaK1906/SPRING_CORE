package com.cdac.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cdac.spring.model.Student;

@Controller
public class MyController {
	//here from login url we are redirecting to welcome.jsp
	@RequestMapping("/login")
	public String getpage(Model m) {
		System.out.println("---------------------debug------------");
		m.addAttribute("Data","This page design by sanjana");
		return "welcome";
	}
	@RequestMapping("/login1")
	public String getpage1(ModelMap m) {
		Student s= new Student(11,"sanjana",90.8);
		m.addAttribute("student",s);
		m.addAttribute("Data","This page design by sanjana");
		return "welcome";
	}
	@RequestMapping("/login2")
	public ModelAndView getpage2() {
		 ModelAndView m= new  ModelAndView();
		 Student s1= new Student(11,"saurabh",95.8);
		 m.setViewName("welcome");
		 m.addObject("Data","testing new login 2");
		 m.addObject("student",s1);
		return m;
	}
}
