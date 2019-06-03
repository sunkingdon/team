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
	
			public void setEmpdao(EmpDao empdao) {
		this.empdao = empdao;
	}
			public EmpServiceImpl() {
				// TODO Auto-generated constructor stub
				System.out.println("22222222222222Service");
			}
	@Override
	public List<EmpVo> selectList() {
		// TODO Auto-generated method stub
		return empdao.selectList();
	}
}
