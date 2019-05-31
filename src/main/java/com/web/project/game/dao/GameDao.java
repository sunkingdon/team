package com.web.project.game.dao;

import org.apache.ibatis.session.SqlSession;

public class GameDao {
	SqlSession sqlSession;
	
	public void setSqlSession(SqlSession s) {
		sqlSession = s;
	}
}
