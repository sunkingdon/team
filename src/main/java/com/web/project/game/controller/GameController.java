package com.web.project.game.controller;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.project.game.service.GameService;
import com.web.project.game.vo.GameVo;

@Controller
public class GameController {
	@Autowired

	GameService gameService;

	GameVo vo;
	
	@Autowired
	ServletContext application;
	@Autowired
	HttpSession session;
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping("/gamelist.do")
	public String selectList(Model m) {
		List<GameVo> list = gameService.selectList();
		m.addAttribute("list",list);
		return "gamelist";
	}
	
	@RequestMapping("/categorylist.do")
	public String category(int genreno, Model m) {
		List<GameVo> list = gameService.categoryList(genreno);
		m.addAttribute("list",list);
		return "categorylist";
	}
}
