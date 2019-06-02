package com.web.project.game.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.web.project.game.vo.GameVo;

@Repository("game_dao")
public class GameDao {
	SqlSession sqlSession;
	
	public void setSqlSession(SqlSession s) {
		sqlSession = s;
	}
	
	public List<GameVo> selectList(){
		return sqlSession.selectList("game.gameSelect");
	}
}
