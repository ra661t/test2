package com.example.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.dto.Dept;

@Repository
public class DBOracleDAO implements DBDao {

	@Override
	public List<Dept> list(SqlSessionTemplate session) {
		return session.selectList("DeptMapper.selectAll");
	}

	@Override
	public int insert(SqlSessionTemplate session, Dept dto) {
		return session.insert("DeptMapper.insert", dto);
	}

	@Override
	public int deleteByDeptno(SqlSessionTemplate session, int deptno) {
		return session.delete("DeptMapper.deleteByDeptno", deptno);
	}

	@Override
	public int update(SqlSessionTemplate session, Dept dto) {
		return session.update("DeptMapper.update", dto);
	}

	@Override
	public Dept selectByDeptno(SqlSessionTemplate session, int deptno) {
		return session.selectOne("DeptMapper.selectByDeptno", deptno);
	}

}
