package com.web.project.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.project.emp.service.EmpService;
import com.web.project.emp.service.EmpServiceImpl;
import com.web.project.emp.vo.EmpVo;

@Controller
public class EmpController {
	@Autowired
	EmpService empservice;
	public EmpController() {
		// TODO Auto-generated constructor stub
		System.out.println("1111111111111Controller");
	}
	@RequestMapping("/")
	public String main() {
		return "home";
	}
	@RequestMapping("/list")
	public String list(Model m){
		List<EmpVo> list = empservice.selectList();
		m.addAttribute("list", list);
		return "result";
	}
}
