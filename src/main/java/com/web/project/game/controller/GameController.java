package com.web.project.game.controller;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.project.game.service.GameServiceImpl;
import com.web.project.game.vo.GameVo;

@Controller
public class GameController {
	@Autowired
	GameServiceImpl game_service;

	GameVo vo;
	
	@Autowired
	ServletContext application;
	@Autowired
	HttpSession session;
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping("/")
	public String main() {
		return "home";
	}
	
	@RequestMapping("/gamelist.do")
	public String selectList(Model m) {
		System.out.println("controller¿« select");
		List<GameVo> list = game_service.selectList();
		m.addAttribute("list",list);
		return "gamelist";
	}
}
