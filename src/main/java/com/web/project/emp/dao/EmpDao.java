package com.web.project.emp.dao;

import java.util.List;


import org.apache.ibatis.session.SqlSession;


import com.web.project.emp.vo.EmpVo;


public class EmpDao {
	SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	public List<EmpVo> selectList(){
		System.out.println("33333333333333333Dao");
		return sqlSession.selectList("emp.emp_list");
	}
}
