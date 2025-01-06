package com.cdac.spring.controller;

import javax.servlet.ServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.spring.model.StudentF;

@Controller
@RequestMapping("/user")

public class FormController {
	@RequestMapping("/form")
	public String getuser() {
		return "stuForm";
	}
	
	@RequestMapping(value="/log1", method=RequestMethod.POST)
	public String getformhandler(jakarta.servlet.ServletRequest req ,Model m) {
		int sid=Integer.parseInt(req.getParameter("sid"));
		String name=req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		int std_class=Integer.parseInt(req.getParameter("std_class"));
		StudentF s= new StudentF(sid,name,age,std_class);
		m.addAttribute("stu",s);
		return "Sucess";
	}
	
	@RequestMapping(value="/log2", method=RequestMethod.POST)
	public String getformhandler(@RequestParam String sid, @RequestParam String name, @RequestParam String age,@RequestParam String std_class  ,Model m) {
		
		StudentF s= new StudentF(Integer.parseInt(sid),name,Integer.parseInt(age),Integer.parseInt(std_class));
		m.addAttribute("stu",s);
		return "Sucess";
	}
	@PostMapping("/log3")
	public String getformhandler(@ModelAttribute StudentF students, Model m) {
		m.addAttribute("stu",students);
		return "Sucess";
	}
}
