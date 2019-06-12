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
		// 메인 (배너) 게임 리스트
		List<GameVo> mainlist = gameService.mainList();
		m.addAttribute("mainlist", mainlist);
		
		// 최신 게임 리스트
		List<GameVo> latestlist = gameService.recentList();
		m.addAttribute("latestList", latestlist);
		
		// 인기있는 게임 리스트 
		List<GameVo> popularlist = gameService.popularList();
		m.addAttribute("popularList", popularlist);
		
		// 가격이 높은 게임 리스트
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
		
		// 필터
		String filter = request.getParameter("filter");
		
		pageingvo.setCurrentPage(currentPage);
		pageingvo.setBegin(begin);
		pageingvo.setEnd(end);
		pageingvo.setFilter(filter);

		request.setAttribute("pagelist", gameService.pagingList(pageingvo));
		request.setAttribute("totalPage", (total - 1) / 9 + 1);

		// 게임 리스트 출력
		List<GameVo> list = gameService.gameList();
		m.addAttribute("list", list);
		m.addAttribute("filter", filter);
		
		// 최신 게임 리스트 출력
		List<GameVo> latestlist = gameService.recentList();
		m.addAttribute("latestList", latestlist);

		return "store";
	}

	@RequestMapping("/gamesingle.do")
	public String single(String title,String name, Model m) {
		// 게임 상세 리스트 
		List<GameVo> singleList = gameService.singleList(title);
		m.addAttribute("singlelist", singleList);
		
		System.out.println();
		
		
		// 최신 게임 리스트
		List<GameVo> latestlist = gameService.recentList();
		m.addAttribute("latestList", latestlist);
		
		// 같은 장르의 게임 리스트 
		List<GameVo> samecategorylist = gameService.sameCategorySelect(singleList.get(0).getGenrename());
		m.addAttribute("samecategorylist", samecategorylist);

		return "gameSingle";
	}

	@RequestMapping("/categorylist.do")
	public String category(String genrename, Model m) {
		// 카테고리별 게임 리스트
		List<GameVo> categorylist = gameService.categoryList(genrename);
		m.addAttribute("categorylist", categorylist);
		
		// 최신 게임 리스트
		List<GameVo> latestlist = gameService.recentList();
		m.addAttribute("latestList", latestlist);

		return "categoryStore";
	}
}
