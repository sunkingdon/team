package com.web.project.game.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.web.project.game.dao.CategoryDao;
import com.web.project.game.dao.GameDao;
import com.web.project.game.dao.ImageDao;

@Controller
public class GameController {
	@Autowired
	ServletContext application;
	@Autowired
	HttpSession session;
	@Autowired
	HttpServletRequest request;
	
	private GameDao game_dao;
	private ImageDao image_dao;
	private CategoryDao category_dao;
	
	public GameController(GameDao dao) {
		game_dao = dao;
	}
}
