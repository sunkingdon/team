package com.web.project.purchase.service;

import java.util.List;

import com.web.project.purchase.vo.PurchaseVo;

public interface PurchaseService {
	public List<PurchaseVo> selectList(String id);
}
