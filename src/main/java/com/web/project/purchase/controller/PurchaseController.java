package com.web.project.purchase.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.web.project.purchase.dao.PurchaseDao;
import com.web.project.purchase.service.PurchaseServiceImpl;

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
	
}
