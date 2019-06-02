package com.web.project.emp.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.web.project.emp.vo.EmpVo;

@Repository
public class EmpDao {
	SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	public List<EmpVo> selectList(){
		return sqlSession.selectList("emp.emp_list");
	}
}
