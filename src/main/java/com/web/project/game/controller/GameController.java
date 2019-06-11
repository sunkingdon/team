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
	public String home(Model m) {
		List<GameVo> mainlist = gameService.mainList();
		List<GameVo> latestlist = gameService.recentList();
		List<GameVo> popularlist = gameService.popularList();
		List<GameVo> highlist = gameService.highList();
		
		m.addAttribute("mainlist", mainlist);
		m.addAttribute("latestList", latestlist);
		m.addAttribute("popularList", popularlist);
		m.addAttribute("highlist", highlist);
		return "home";
	}
	
	@RequestMapping("/store.do")
	public String selectList(Model m) {
		List<GameVo> list = gameService.gameList();
		m.addAttribute("list",list);
		return "store";
	}
	
	@RequestMapping("/gamesingle.do")
	public String single(String title, Model m) {
		System.out.println("title : " + title);
		List<GameVo> singleList = gameService.singleList(title);
		m.addAttribute("singlelist",singleList);
		return "gameSingle";
	}
	
	@RequestMapping("/categorylist.do")
	public String category(String genrename, Model m) {
		List<GameVo> categorylist = gameService.categoryList(genrename);
		m.addAttribute("categorylist",categorylist);
		return "categoryStore";
	}
}
