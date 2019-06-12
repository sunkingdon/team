package com.web.project.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewController {
	@RequestMapping("/reviews")
	public String selectList(Model m) {
		//List<GameVo> list = gameService.selectList();
		//m.addAttribute("list",list);
		return "reviews";
	}
		
	@RequestMapping("/reviewSingle")
	public String singleView(Model m) {
		return "reviewSingle";
	}
	
	@RequestMapping("/writeReview")
	public String writeView(Model m) {
		return "writeReview";
	}
		
	
	
	
	
		
}
