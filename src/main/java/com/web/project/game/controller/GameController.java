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
import com.web.project.game.vo.PagingVo;

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

	@RequestMapping(value = { "/", "home.do" })
	public String home(Model m) {
		List<GameVo> mainlist = gameService.mainList();
		m.addAttribute("mainlist", mainlist);
		List<GameVo> latestlist = gameService.recentList();
		m.addAttribute("latestList", latestlist);
		List<GameVo> popularlist = gameService.popularList();
		m.addAttribute("popularList", popularlist);
		List<GameVo> highlist = gameService.highList();
		m.addAttribute("highlist", highlist);

		return "home";
	}

	@RequestMapping("/store.do")
	public String selectList(Model m, PagingVo pageingvo) {
		// 페이징 처리
		String sPage = request.getParameter("page");
		int currentPage = sPage != null ? Integer.parseInt(sPage) : 1;
		int end = currentPage * 9;
		int begin = end - (9 - 1);
		int total = gameService.getTotalCount();

		pageingvo.setCurrentPage(currentPage);
		pageingvo.setBegin(begin);
		pageingvo.setEnd(end);
		System.out.println(pageingvo.getBegin());
		System.out.println(pageingvo.getEnd());
		System.out.println(pageingvo.getCurrentPage());
		request.setAttribute("pagelist", gameService.pagingList(pageingvo));
		request.setAttribute("totalPage", (total - 1) / 9 + 1);

		// 게임 리스트 출력
		List<GameVo> list = gameService.gameList();
		m.addAttribute("list", list);
		// 최신 게임 리스트 출력
		List<GameVo> latestlist = gameService.recentList();
		m.addAttribute("latestList", latestlist);

		return "store";
	}

	@RequestMapping("/gamesingle.do")
	public String single(String title, Model m) {
		List<GameVo> singleList = gameService.singleList(title);
		m.addAttribute("singlelist", singleList);
		List<GameVo> latestlist = gameService.recentList();
		m.addAttribute("latestList", latestlist);

		return "gameSingle";
	}

	@RequestMapping("/categorylist.do")
	public String category(String genrename, Model m) {
		List<GameVo> categorylist = gameService.categoryList(genrename);
		m.addAttribute("categorylist", categorylist);
		List<GameVo> latestlist = gameService.recentList();
		m.addAttribute("latestList", latestlist);

		return "categoryStore";
	}
}
