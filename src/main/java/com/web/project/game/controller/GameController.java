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
	GameServiceImpl gameService;
	@Autowired
	ServletContext application;
	@Autowired
	HttpSession session;
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping(value= {"/", "home.do"})
	public String home() {
		return "home";
	}
	
	@RequestMapping("/store.do")
	public String selectList(Model m) {
		//List<GameVo> list = gameService.selectList();
		//m.addAttribute("list",list);
		return "store";
	}
	
	@RequestMapping("/gamesingle.do")
	public String single() {
		return "game-single";
	}
	
	@RequestMapping("/categorylist.do")
	public String category(int genreno, Model m) {
		List<GameVo> list = gameService.categoryList(genreno);
		m.addAttribute("list",list);
		return "categorylist";
	}
}
