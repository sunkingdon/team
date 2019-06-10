package com.web.project.game.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.project.game.dao.CategoryDao;
import com.web.project.game.dao.GameDao;
import com.web.project.game.dao.ImageDao;
import com.web.project.game.vo.GameVo;

@Service("gameService")
public class GameServiceImpl implements GameService{
	@Autowired
	private GameDao gameDao;
	@Autowired
	private CategoryDao categoryDao;
	@Autowired
	private ImageDao imageDao;
	
	public void setGameDao(GameDao d) {
		gameDao = d;
	}
	
	@Override 
	public List<GameVo> categoryList(String genrename) {
		return gameDao.categoryList(genrename);
	}
	
	@Override
	public List<GameVo> gameList() {
		return gameDao.gameList();
	}

	@Override
	public List<GameVo> recentList() {
		return gameDao.recentList();
	}
	
	@Override
	public List<GameVo> popularList() {
		return gameDao.popularList();
	}

	public List<GameVo> singleList(String title) {
		return gameDao.singleList(title);
	}
}
