package com.web.project.purchase.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.web.project.purchase.dao.PurchaseDao;
import com.web.project.purchase.service.PurchaseService;

@Controller
public class PurchaseController {
	PurchaseDao Dao;
	
	@Autowired
	PurchaseService purchase_serivce;
	
	@Autowired
	HttpServletRequest request;
	
	@Autowired
	HttpSession session;
	
	public PurchaseController() {
		
	}
	public PurchaseController(PurchaseDao Dao) {
		this.Dao = Dao;
	}
}
