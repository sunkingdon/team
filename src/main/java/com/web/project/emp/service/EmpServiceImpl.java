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
	//로그인 Exception처리 => e.getMessage()
	@Override
	public EmpVo login(String id, String pw) throws IdNotFoundException, PwMissMatchException,BlankException{
		// TODO Auto-generated method stub
		EmpVo vo=empDao.selectList(id);
		if(id==""||pw=="")
			throw new BlankException("빈칸이 있습니다.");
		else{
		if(vo==null){ //vo변수에 id 담음
			throw new IdNotFoundException("해당 아이디가 없습니다.");
		}else{
			if(vo.getPw().equals(pw)){ //getPw()비밀번호 비교
				return vo;	
			}else{
				throw new PwMissMatchException("비밀번호를 확인해 주세요.");
			}
		}
	}
	}
	//자기정보 조회
	@Override
	public EmpVo selectList(String id) {
		// TODO Auto-generated method stub
		return empDao.selectList(id);
	}
}
