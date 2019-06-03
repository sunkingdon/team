package com.web.project.game.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.web.project.game.vo.GameVo;

@Repository
public class GameDao {
	@Autowired
	SqlSession sqlSession;
	
	public GameDao() {
		System.out.println("dao °´Ã¼ »ý¼º--");
	}
	
	public List<GameVo> selectList(){
		System.out.println("daoÀÇ select");
		return sqlSession.selectList("game.gameSelect");
	}
}
