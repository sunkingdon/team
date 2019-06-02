package com.web.project.game.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository("categoryDao")
public class CategoryDao {
	SqlSession sqlSession;

	public void setSqlSession(SqlSession s) {
		sqlSession = s;
	}
}
