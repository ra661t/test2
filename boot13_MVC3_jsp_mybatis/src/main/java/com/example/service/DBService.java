package com.example.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.example.dto.Dept;

public interface DBService {
	public abstract List<Dept> list();
	public abstract Dept selectByDeptno(int deptno);
	public abstract int insert(Dept dto);
	public abstract int deleteByDeptno( int deptno);
	public abstract int update( Dept dto);
}
