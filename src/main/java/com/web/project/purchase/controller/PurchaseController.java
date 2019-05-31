package com.web.project.purchase.controller;

import org.springframework.stereotype.Controller;
import com.web.project.purchase.dao.PurchaseDao;

@Controller
public class PurchaseController {
	PurchaseDao Dao;
	
	public PurchaseController() {
		
	}
	public PurchaseController(PurchaseDao Dao) {
		this.Dao = Dao;
	}
}
