package com.web.project.emp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.project.emp.dao.EmpDao;
import com.web.project.emp.exception.BlankException;
import com.web.project.emp.exception.EmailMissMatchException;
import com.web.project.emp.exception.IdNotFoundException;
import com.web.project.emp.exception.PwMissMatchException;
import com.web.project.emp.vo.EmpVo;

@Service("empService")
public class EmpServiceImpl implements EmpService{
	@Autowired
	private EmpDao empDao;
	
	public EmpServiceImpl() {
			}
	@Override
	public List<EmpVo> selectList() {
		return empDao.selectList();
	}
	//�α��� Exceptionó�� => e.getMessage()
	@Override
	public EmpVo login(String id, String pw) throws IdNotFoundException, PwMissMatchException,BlankException{
		EmpVo vo=empDao.selectList(id);
		if(id==""||pw=="")
			throw new BlankException("��ĭ�� �ֽ��ϴ�.");
		else{
		if(vo==null){ //vo�� id ����
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
	//��й�ȣã��
	@Override
	public EmpVo findPw(String id, String email) throws IdNotFoundException, BlankException, EmailMissMatchException {
		// TODO Auto-generated method stub
		EmpVo vo=empDao.selectList(id);
		if(id==""||email=="")
			throw new BlankException("��ĭ�� �ֽ��ϴ�.");
		else{
		if(vo==null){ //vo�� id ����
			throw new IdNotFoundException("�ش� ���̵� �����ϴ�.");
		}else{
			if(vo.getEmail().equals(email)){ //�̸��� Ȯ��
				return vo;	
			}else{
				throw new EmailMissMatchException("�̸����� �߸� �Է� �Ǿ����ϴ�.");
			}
		}
	}
	}
	//�ڱ����� ��ȸ
	@Override
	public EmpVo selectList(String id) {
		return empDao.selectList(id);
	}
	@Override
	public int insert(EmpVo empVo) {
		return empDao.insert(empVo);
	}
	@Override
	public int update(EmpVo empVo) {
		// TODO Auto-generated method stub
		return empDao.update(empVo);
	}
	@Override
	public void delete(EmpVo empVo) {
		// TODO Auto-generated method stub
		empDao.delete(empVo);
	}
}
