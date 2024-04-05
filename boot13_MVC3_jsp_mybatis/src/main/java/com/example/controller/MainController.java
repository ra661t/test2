package com.example.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dao.DBDao;
import com.example.dto.Dept;
import com.example.service.DBService;

@Controller
public class MainController {
	@Autowired
	DBService service;

	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String main() {
		System.out.println("///////////////////////");
		return "main"; //main.jsp 
	}

//	@GetMapping("/test")   //get  요청만 처리 
//	public String testGet() {
//	System.out.println(service);
//	System.out.println(dao);
//	System.out.println(session);
//		return "main"; //main.jsp 
//	}
	
	@RequestMapping("/list")
	//@ResponseBody
	public String list(Model m) {
		List<Dept> allData= service.list();
		System.out.println(allData);		
		m.addAttribute("allData", allData);
		return "list"; //list.jsp 
	}
	
	@GetMapping("/deptDelete")
	public String deptDelete(int deptno) {
		System.out.println(deptno);
		service.deleteByDeptno(deptno);
		return  "redirect:/list";  //list 재요청
	}

}
