package com.web.project.purchase.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository("amount_dao")
public class AmountDao {
	SqlSession sqlSession;
	
	public void setSqlSession(SqlSession s) {
		sqlSession = s;
	}
}
