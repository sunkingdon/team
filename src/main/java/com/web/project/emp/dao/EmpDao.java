package com.web.project.emp.dao;

import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.web.project.emp.vo.EmpVo;

@Repository("empDao")
public class EmpDao {
	@Autowired
	SqlSession sqlSession;

	public List<EmpVo> selectList(){ //��ü ��ȸ
		System.out.println("33333333333333333Dao");
		return sqlSession.selectList("emp.emp_list");
	}
	public EmpVo selectList(String id) { //��ȸ
		return sqlSession.selectOne("emp.emp_select",id);
	}
}
