package com.web.project.purchase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.project.purchase.dao.AmountDao;
import com.web.project.purchase.dao.PurchaseDao;

@Service("purchase_service")
public class PurchaseService {
	@Autowired
	PurchaseDao purchase_dao;
	
	@Autowired
	AmountDao amount_dao;
}
