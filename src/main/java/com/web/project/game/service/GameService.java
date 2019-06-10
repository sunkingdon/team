package com.web.project.game.service;

import java.util.List;

import com.web.project.game.vo.GameVo;

public interface GameService {
	// home의 메인 게임 목록 (배너)
	public List<GameVo> mainList();
	
	// home의 최신 게임 목록
	public List<GameVo> recentList();
	
	// home의 인기있는 게임 목록
	public List<GameVo> popularList();
	
	// 카테고리별 게임 목록
	public List<GameVo> categoryList(String genrename);
	
	// 게임 상세 페이지 
	public List<GameVo> singleList(String title);
	
	// store의 게임 목록
	public List<GameVo> gameList();
	
}
