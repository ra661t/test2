package com.example.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.DBDao;
import com.example.dto.Dept;

@Service("myService")
public class DBOracleService implements DBService {
	
	@Autowired
	DBDao dao;
	
	@Autowired
	SqlSessionTemplate session;
	
	@Override
	public List<Dept> list() {
		return dao.list(session);
	}
	@Override
	public int insert(Dept dto) {
		return dao.insert(session, dto); // auto commit
	}
	@Override
	public int deleteByDeptno(int deptno) {
		return dao.deleteByDeptno(session, deptno);
	}
	@Override
	public int update(Dept dto) {
		return dao.update(session, dto);
	}
	@Override
	public Dept selectByDeptno(int deptno) {
		return dao.selectByDeptno(session, deptno);
	}

}
