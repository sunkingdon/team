package com.web.project.purchase.dao;

import org.apache.ibatis.session.SqlSession;

public class AmountDao {
	SqlSession sqlSession;
	
	public void setSqlSession(SqlSession s) {
		sqlSession = s;
	}
}
