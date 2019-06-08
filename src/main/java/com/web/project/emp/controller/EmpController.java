package com.web.project.emp.controller;

import javax.servlet.http.Cookie;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;



import com.web.project.emp.service.EmpService;
import com.web.project.emp.vo.EmpVo;

@Controller
public class EmpController {
	@Autowired
	EmpService empService;

	
	//�α�����
	@RequestMapping("/loginView")
	public String loginView() {
		return "login";
	}
	//ȸ��������
	@RequestMapping("/signupView")
	public String insertView() {
		return "signup";
	}
	//ȸ��Ż����
	@RequestMapping("/signOutView")
	public String signOutView() {
		return "signOuttest";
	}
//////////////////////////////////////////////////////////////////////////////////////////////
///////////////////                		 							       ///////////////////
///////////////////						      �ڵ�						   ///////////////////
///////////////////														   ///////////////////	
//////////////////////////////////////////////////////////////////////////////////////////////	
	// �α���
	@RequestMapping("/login.do")
	public String login(EmpVo empVo, HttpSession session, HttpServletRequest req, HttpServletResponse resp) {
		try {
			String id = req.getParameter("username");
			String pw = req.getParameter("pass");
			empVo = empService.login(id, pw);
			// �α��� checkbox ��Ű ����
			String remember = req.getParameter("remember-me");
			Cookie cookie = new Cookie("cookieId", id);
			if (empVo != null) {
				req.getSession().setAttribute("id", empVo.getId());
				req.getSession().setAttribute("name", empVo.getName());
				if (remember == null) { // üũ�ڽ� üũ �ȵǾ�������
					cookie.setPath("/");
					cookie.setMaxAge(0); // 0���� �ʱ�ȭ
				} else {
					cookie.setPath("/");
					cookie.setMaxAge(60 * 60 * 24 * 7); // ��Ű 7�� ����
				}
				resp.addCookie(cookie);
				///////////////////////////
				return "home";
			}

		} catch (Exception e) { // EmpService���� ó���� Exception
			req.setAttribute("message", e.getMessage());
		}
		return "login";
	}

	// �α׾ƿ�
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "home";
	}

	// ��ü ��ȸ
	@RequestMapping("/list.do")
	public String list(Model m) {
		m.addAttribute("list", empService.selectList());
		return "resulttest";
	}

	// ���� ���� ��ȸ
	@RequestMapping("/myInfo.do")
	public String myInfo(String id, Model m) {
		m.addAttribute("empVo", empService.selectList(id));
		return "myPagetest";
	}
	//ȸ������
	@RequestMapping("/signUp.do")
	public String signUp(EmpVo empVo,HttpServletRequest req) {
	
		empService.insert(empVo);
		return "login";
	}
	
	@RequestMapping("/update.do")
	public String update(EmpVo empVo) {
		empService.update(empVo);
		return "home";
	}
	//Ż��
	@RequestMapping("/delete.do")
	public String delete(EmpVo empVo,HttpSession session) {
		empService.delete(empVo);
		session.invalidate();
		return "home";
	}
}
