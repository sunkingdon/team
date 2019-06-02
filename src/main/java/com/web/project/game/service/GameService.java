package com.web.project.game.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.project.game.dao.CategoryDao;
import com.web.project.game.dao.GameDao;
import com.web.project.game.dao.ImageDao;
import com.web.project.game.vo.GameVo;

@Service("game_service")
public class GameService implements GameServiceImpl {
	@Autowired
	GameDao gamedao;
	@Autowired
	CategoryDao categorydao;
	@Autowired
	ImageDao imagedao;
	
	@Override
	public List<GameVo> selectList() {
		return gamedao.selectList();
	}
}
