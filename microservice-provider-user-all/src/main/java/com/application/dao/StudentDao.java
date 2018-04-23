package com.application.dao;

import com.application.entity.Student;

public interface StudentDao {
	
	Student findByNameJdbc(String name);
	Student findByNameMybatis(String name);
	Student findByNameMybatisNo(String name);
}
