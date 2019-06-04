package com.web.project.emp.service;

import java.util.List;

import com.web.project.emp.exception.BlankException;
import com.web.project.emp.exception.IdNotFoundException;
import com.web.project.emp.exception.PwMissMatchException;
import com.web.project.emp.vo.EmpVo;


public interface EmpService {
	public List<EmpVo> selectList();
	public EmpVo login(String id,String pw)throws IdNotFoundException, PwMissMatchException,BlankException;
	public EmpVo selectList(String id);
}
