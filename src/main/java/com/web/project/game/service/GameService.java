package com.web.project.game.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.project.game.dao.CategoryDao;
import com.web.project.game.dao.GameDao;
import com.web.project.game.dao.ImageDao;
import com.web.project.game.vo.GameVo;

@Service
public class GameService implements GameServiceImpl {
	
	public GameService() {
		System.out.println("service ����--");
	}
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
	public List<GameVo> selectList() {
		return gameDao.selectList();
	}
}
