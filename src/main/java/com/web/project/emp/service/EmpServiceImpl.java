package com.web.project.emp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.project.emp.dao.EmpDao;
import com.web.project.emp.vo.EmpVo;

@Service
public class EmpServiceImpl implements EmpService{
	@Autowired
	private EmpDao empdao;
	@Override
	public List<EmpVo> selectList() {
		// TODO Auto-generated method stub
		return empdao.selectList();
	}
}
