package com.web.project.game.service;

import java.util.List;

import com.web.project.game.vo.GameVo;

public interface GameService {
	public List<GameVo> selectList();
	public List<GameVo> categoryList(int genreno);
}
