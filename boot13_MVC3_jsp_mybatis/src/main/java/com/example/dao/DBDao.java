package com.example.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.example.dto.Dept;

public interface DBDao {

	public abstract List<Dept> list(SqlSessionTemplate session);
	public abstract Dept selectByDeptno(SqlSessionTemplate session, int deptno);
	public abstract int insert(SqlSessionTemplate session, Dept dto);
	
	public abstract int deleteByDeptno(SqlSessionTemplate session, int deptno);
	public abstract int update(SqlSessionTemplate session, Dept dto);
	
}
