package com.web.project.game.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.web.project.game.vo.GameVo;
import com.web.project.game.vo.PagingVo;

@Repository("gameDao")
public class GameDao {
	@Autowired
	SqlSession sqlSession;
	
	public GameDao() {
	}
	
	public List<GameVo> recentList(){
		return sqlSession.selectList("game.recentSelect");
	}
	
	public List<GameVo> popularList() {
		return sqlSession.selectList("game.popularSelect");
	}
	
	public List<GameVo> gameList(){
		return sqlSession.selectList("game.gameSelect");
	}
	
	public List<GameVo> categoryList(String genrename){
		return sqlSession.selectList("game.categorySelect",genrename);
	}

	public List<GameVo> sameCategorySelect(String genrename) {
		return sqlSession.selectList("game.sameCategorySelect", genrename);
	}
	
	public List<GameVo> singleList(String title) {
		return sqlSession.selectList("game.singleSelect", title);
	}
	
	public List<GameVo> mainList() {
		return sqlSession.selectList("game.mainSelect");
	}
	
	public List<GameVo> highList() {
		return sqlSession.selectList("game.highSelect");
	}

	// 페이징 처리
	public int getTotalCount() {
		return sqlSession.selectOne("game.pagingSelectTotal");
	}
	
	public List<GameVo> pagingList(PagingVo vo) {
		return sqlSession.selectList("game.pagingSelect", vo);
	}
}
