package com.web.project.game.service;

import java.util.List;

import com.web.project.game.vo.GameVo;

public interface GameService {
	// ī�װ��� ���� ���
	public List<GameVo> categoryList(String genrename);
	
	// ���� �� ������ 
	public List<GameVo> singleList(String title);
	
	// home�� �ֽ� ���� ���
	public List<GameVo> recentList();
	
	// home�� �α��ִ� ���� ���
	public List<GameVo> popularList();
	
	// store�� ���� ���
	public List<GameVo> gameList();
	
}
