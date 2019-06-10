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
	
	// 메인 페이지 
	@RequestMapping(value= {"/", "home.do"})
	public String home(Model m) {
		List<GameVo> mainlist = gameService.mainList();
		List<GameVo> latestlist = gameService.recentList();
		List<GameVo> popularlist = gameService.popularList();
		m.addAttribute("mainlist", mainlist);
		m.addAttribute("latestList", latestlist);
		m.addAttribute("popularList", popularlist);
		return "home";
	}
	
	// store 페이지
	@RequestMapping("/store.do")
	public String selectList(Model m) {
		List<GameVo> list = gameService.gameList();
		m.addAttribute("list",list);
		return "store";
	}
	
	// 게임 상세 페이지
	@RequestMapping("/gamesingle.do")
	public String single(String title, Model m) {
		System.out.println("title : " + title);
		List<GameVo> singleList = gameService.singleList(title);
		m.addAttribute("singlelist",singleList);
		return "gameSingle";
	}
	
	// 카테고리별 게임 페이지
	@RequestMapping("/categorylist.do")
	public String category(String genrename, Model m) {
		List<GameVo> categorylist = gameService.categoryList(genrename);
		m.addAttribute("categorylist",categorylist);
		return "categoryStore";
	}
}
