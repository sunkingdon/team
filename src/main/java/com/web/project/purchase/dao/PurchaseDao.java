package com.web.project.purchase.dao;

import org.apache.ibatis.session.SqlSession;

public class PurchaseDao {
	SqlSession sqlSession;
	
	public void setSqlSession(SqlSession s) {
		sqlSession = s;
	}
}
