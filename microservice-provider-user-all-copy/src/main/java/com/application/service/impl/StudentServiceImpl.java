package com.application.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.dao.StudentDao;
import com.application.entity.Student;
import com.application.repository.StudentRepository;
import com.application.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDao studentDao;
	
	@Autowired
	private StudentRepository stuRepository;
	
	/*@Autowired
	private StudentMapper studentMapper;*/
	
	public Student findByNameJpa(String name) {
		System.out.println("Service:findByNameJpa..."+name);
		Student student=stuRepository.findByName(name);
		return student;
	}
	
	public Student findByNameJdbc(String name) {
		System.out.println("Service:findByNameJdbc..."+name);
		Student student=studentDao.findByNameJdbc(name);
		return student;
	}
	
	public Student findByNameMybatis(String name) {
		System.out.println("Service:findByNameMybatis..."+name);
		Student student=studentDao.findByNameMybatis(name);
		return student;
	}
	
	public Student findByNameMybatisNo(String name) {
		System.out.println("Service:findByNameMybatisNo..."+name);
		Student student=studentDao.findByNameMybatisNo(name);
		return student;
	}
}
