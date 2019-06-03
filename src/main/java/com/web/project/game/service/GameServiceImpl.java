package com.web.project.game.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.project.game.dao.CategoryDao;
import com.web.project.game.dao.GameDao;
import com.web.project.game.dao.ImageDao;
import com.web.project.game.vo.GameVo;

@Service
public class GameServiceImpl implements GameService {
	
	public GameServiceImpl() {
		System.out.println("service Ω««‡--");
	}
	@Autowired
	GameDao gameDao;
	@Autowired
	CategoryDao categoryDao;
	@Autowired
	ImageDao imageDao;
	
	
	public void setGameDao(GameDao d) {
		gameDao = d;
	}
	
	@Override
	public List<GameVo> selectList() {
		System.out.println("service¿« select");
		return gameDao.selectList();
	}
}
