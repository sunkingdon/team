package com.web.project.emp.controller;

import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.project.emp.service.EmpService;
import com.web.project.emp.vo.EmpVo;

@Controller
public class EmpController{
	@Autowired
	EmpService empService;
	public EmpController() {
		// TODO Auto-generated constructor stub
		System.out.println("1111111111111Controller");
	}
	@RequestMapping("/")
	public String main() {
		return "home";
	}
	
	@RequestMapping("/loginView")
	public String loginView() {
	return "login";
	}
	//�α���
	@RequestMapping("/login")
	public String login(EmpVo empVo,HttpSession session,HttpServletRequest req) {
		try {
			String id=req.getParameter("username");
			String pw=req.getParameter("pass");
			empVo=empService.login(id, pw);
		if(empVo!=null) {
			req.getSession().setAttribute("id",empVo.getId());
			req.getSession().setAttribute("name",empVo.getName());
			return "home";
		}
		
		}catch(Exception e) { //EmpService���� ó���� Exception
			req.setAttribute("message", e.getMessage());
		}
		return "login";
	}
	//�α׾ƿ�
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "home";
	}
	//��ü ��ȸ
		@RequestMapping("/list")
		public String list(Model m){
			m.addAttribute("list",empService.selectList());
			return "result";
		}
	//���� ���� ��ȸ
		@RequestMapping("/myInfo")
		public String myInfo(String id,Model m) {
			m.addAttribute("empVo",empService.selectList(id));
			return "myPage";
		}
}
