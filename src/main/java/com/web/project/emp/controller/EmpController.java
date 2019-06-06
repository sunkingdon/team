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

	public EmpController() {
	}

	@RequestMapping("/loginView")
	public String loginView() {
		return "login";
	}

	@RequestMapping("/insertView")
	public String insertView() {
		return "insert";
	}

	// 로그인
	@RequestMapping("/login")
	public String login(EmpVo empVo, HttpSession session, HttpServletRequest req, HttpServletResponse resp) {
		try {
			String id = req.getParameter("username");
			String pw = req.getParameter("pass");
			empVo = empService.login(id, pw);
			// 로그인 checkbox 쿠키 설정
			String remember = req.getParameter("rememberId");
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

	// 로그아웃
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "home";
	}

	// 전체 조회
	@RequestMapping("/list")
	public String list(Model m) {
		m.addAttribute("list", empService.selectList());
		return "result";
	}

	// 개인 정보 조회
	@RequestMapping("/myInfo")
	public String myInfo(String id, Model m) {
		m.addAttribute("empVo", empService.selectList(id));
		return "myPage";
	}

	@RequestMapping("/insert")
	public String signUp(EmpVo empVo) {
		empService.insert(empVo);
		return "redirect:list";
	}
}
