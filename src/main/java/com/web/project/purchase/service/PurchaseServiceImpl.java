package com.web.project.purchase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.project.purchase.dao.AmountDao;
import com.web.project.purchase.dao.PurchaseDao;
import com.web.project.purchase.vo.PurchaseVo;

@Service("purchase_service")
public class PurchaseServiceImpl implements PurchaseService {
	public PurchaseServiceImpl() {
	}
	
	@Autowired
	PurchaseDao purchase_dao;
	
	
	@Autowired
	AmountDao amount_dao;

	public void setPurchase_dao(PurchaseDao purchase_dao) {
		this.purchase_dao = purchase_dao;
	}

	public void setAmount_dao(AmountDao amount_dao) {
		this.amount_dao = amount_dao;
	}
	
	@Override
	public List<PurchaseVo> selectList(String id) {
		return purchase_dao.selectList(id);
	}
}
