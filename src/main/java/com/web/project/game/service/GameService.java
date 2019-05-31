package com.web.project.game.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.project.game.dao.CategoryDao;
import com.web.project.game.dao.GameDao;
import com.web.project.game.dao.ImageDao;

@Service("game_service")
public class GameService {
	@Autowired
	GameDao game_dao;
	CategoryDao category_dao;
	ImageDao image_dao;
}
