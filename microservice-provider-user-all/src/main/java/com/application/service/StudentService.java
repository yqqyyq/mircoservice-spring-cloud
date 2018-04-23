package com.application.service;

import com.application.entity.Student;

public interface StudentService {
	
	Student findByNameJpa(String name);
	Student findByNameJdbc(String name);
	Student findByNameMybatis(String name);
	Student findByNameMybatisNo(String name);
}
