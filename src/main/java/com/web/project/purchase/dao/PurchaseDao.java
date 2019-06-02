package com.web.project.purchase.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.web.project.purchase.vo.PurchaseVo;

@Repository("purchase_dao")
public class PurchaseDao {
	SqlSession sqlSession;
	
	public void setSqlSession(SqlSession s) {
		sqlSession = s;
	}
	public List<PurchaseVo> selectList(){
		return sqlSession.selectList("purchase.purchaseSelect");
	}
}
