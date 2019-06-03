package com.web.project.purchase.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("amount_dao")
public class AmountDao {
	@Autowired
	SqlSession sqlSession;
}
