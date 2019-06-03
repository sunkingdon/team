package com.web.project.game.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("categoryDao")
public class CategoryDao {
	@Autowired
	SqlSession sqlSession;
}
