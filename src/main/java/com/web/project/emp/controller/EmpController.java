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

	
	//로그인폼
	@RequestMapping("/loginView")
	public String loginView() {
		return "login";
	}
	//회원가입폼
	@RequestMapping("/signupView")
	public String insertView() {
		return "signup";
	}
	//회원탈퇴폼
	@RequestMapping("/signOutView")
	public String signOutView() {
		return "signOuttest";
	}
	//비밀번호 찾기 팝업
	@RequestMapping("findPw")
	public String findPw() {
		return "findPwpopuptest";
	}
//////////////////////////////////////////////////////////////////////////////////////////////
///////////////////                		 							       ///////////////////
///////////////////						      코딩						   ///////////////////
///////////////////														   ///////////////////	
//////////////////////////////////////////////////////////////////////////////////////////////	
	// 로그인
	@RequestMapping("/login.do")
	public String login(EmpVo empVo, HttpSession session, HttpServletRequest req, HttpServletResponse resp) {
		try {
			String id = req.getParameter("username");
			String pw = req.getParameter("pass");
			empVo = empService.login(id, pw);
			// 로그인 checkbox 쿠키 설정
			String remember = req.getParameter("remember-me");
			Cookie cookie = new Cookie("cookieId", id);
			if (empVo != null) {
				req.getSession().setAttribute("id", empVo.getId());
				req.getSession().setAttribute("name", empVo.getName());
				if (remember == null) { // 체크박스 체크 안되어있을때
					cookie.setPath("/");
					cookie.setMaxAge(0); // 0으로 초기화
				} else {
					cookie.setPath("/");
					cookie.setMaxAge(60 * 60 * 24 * 7); // 쿠키 7일 설정
				}
				resp.addCookie(cookie);
				///////////////////////////
				return "home";
			}

		} catch (Exception e) { // EmpService에서 처리한 Exception
			req.setAttribute("message", e.getMessage());
		}
		return "login";
	}
	//비밀번호 찾기
	@RequestMapping("/findPw.do")
	public String findPw(EmpVo empVo,Model m,HttpServletRequest req) {
		try {
			String id=req.getParameter("id");
			String email=req.getParameter("email");
			empVo=empService.findPw(id, email);
			if(empVo!=null) {
				m.addAttribute("empVo",empVo);
			}
		}catch(Exception e) {
			req.setAttribute("message", e.getMessage());
		}
		return "findPwpopuptest";
	}
	// 로그아웃
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "home";
	}

	// 전체 조회
	@RequestMapping("/list.do")
	public String list(Model m) {
		m.addAttribute("list", empService.selectList());
		return "resulttest";
	}

	// 개인 정보 조회
	@RequestMapping("/myInfo.do")
	public String myInfo(String id, Model m) {
		m.addAttribute("empVo", empService.selectList(id));
		return "myPagetest";
	}
	//회원가입
	@RequestMapping("/signUp.do")
	public String signUp(EmpVo empVo,HttpServletRequest req) {
	
		empService.insert(empVo);
		return "login";
	}
	//회원수정
	@RequestMapping("/update.do")
	public String update(EmpVo empVo) {
		empService.update(empVo);
		return "home";
	}
	//탈퇴
	@RequestMapping("/delete.do")
	public String delete(EmpVo empVo,HttpSession session) {
		empService.delete(empVo);
		session.invalidate();
		return "home";
	}
}
