package com.web.project.purchase.controller;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.project.purchase.service.PurchaseServiceImpl;
import com.web.project.purchase.vo.PurchaseVo;

@Controller
public class PurchaseController {
	
	@Autowired
	PurchaseServiceImpl purchase_serivce;
	
	@Autowired
	ServletContext application;
	
	@Autowired
	HttpServletRequest request;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping("pur.do")
	public String view() {
		return "pur";
	}
	@RequestMapping("p.do")
	public String Plist(String id, Model m) {
		List<PurchaseVo> list = purchase_serivce.selectList(id);
		m.addAttribute("list", list);
		return "purchaseView";
	}
}
