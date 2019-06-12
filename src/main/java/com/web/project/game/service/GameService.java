package com.web.project.game.service;

import java.util.List;

import com.web.project.game.vo.GameVo;
import com.web.project.game.vo.PagingVo;

public interface GameService {
	public List<GameVo> mainList();
	
	public List<GameVo> recentList();
	
	public List<GameVo> popularList();
	
	public List<GameVo> categoryList(String genrename);
	
	public List<GameVo> singleList(String title);
	
	public List<GameVo> gameList();
	
	public List<GameVo> highList();
	
	// 페이징 처리
	public int getTotalCount();
	
	public List<GameVo> pagingList(PagingVo vo);
}
