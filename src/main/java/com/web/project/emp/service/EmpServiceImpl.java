package com.web.project.emp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.project.emp.dao.EmpDao;
import com.web.project.emp.exception.BlankException;
import com.web.project.emp.exception.IdNotFoundException;
import com.web.project.emp.exception.PwMissMatchException;
import com.web.project.emp.vo.EmpVo;

@Service("empService")
public class EmpServiceImpl implements EmpService{
	@Autowired
	private EmpDao empDao;
	
	public EmpServiceImpl() {
				// TODO Auto-generated constructor stub
				System.out.println("22222222222222Service");
			}
	@Override
	public List<EmpVo> selectList() {
		// TODO Auto-generated method stub
		return empDao.selectList();
	}
	//�α��� Exceptionó�� => e.getMessage()
	@Override
	public EmpVo login(String id, String pw) throws IdNotFoundException, PwMissMatchException,BlankException{
		// TODO Auto-generated method stub
		EmpVo vo=empDao.selectList(id);
		if(id==""||pw=="")
			throw new BlankException("��ĭ�� �ֽ��ϴ�.");
		else{
		if(vo==null){ //vo������ id ����
			throw new IdNotFoundException("�ش� ���̵� �����ϴ�.");
		}else{
			if(vo.getPw().equals(pw)){ //getPw()��й�ȣ ��
				return vo;	
			}else{
				throw new PwMissMatchException("��й�ȣ�� Ȯ���� �ּ���.");
			}
		}
	}
	}
	//�ڱ����� ��ȸ
	@Override
	public EmpVo selectList(String id) {
		// TODO Auto-generated method stub
		return empDao.selectList(id);
	}
}
