package com.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.entity.Student;

public interface StudentRepository extends JpaRepository<Student,String>{
	Student findByName(String name);
	Student findByPassword(String password);
}
