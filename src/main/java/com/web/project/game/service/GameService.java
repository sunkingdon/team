package com.web.project.game.service;

import java.util.List;

import com.web.project.game.vo.GameVo;

public interface GameService {
	// home�� ���� ���� ��� (���)
	public List<GameVo> mainList();
	
	// home�� �ֽ� ���� ���
	public List<GameVo> recentList();
	
	// home�� �α��ִ� ���� ���
	public List<GameVo> popularList();
	
	// ī�װ��� ���� ���
	public List<GameVo> categoryList(String genrename);
	
	// ���� �� ������ 
	public List<GameVo> singleList(String title);
	
	// store�� ���� ���
	public List<GameVo> gameList();
	
}
