package com.application.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.application.dao.StudentDao;
import com.application.entity.Student;
import com.application.mapper.StudentMapper;
import com.application.mapper.StudentMapperAn;
import com.application.mapper.StudentMapperJdbc;

import javax.annotation.Resource;

@Repository
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplateObject;
	
	//@Autowired
    @Resource
	private StudentMapperAn studentMapperAn;

    //@Autowired
    @Resource
	private StudentMapper studentMapper;
	
	public Student findByNameJdbc(String name) {
		System.out.println("Dao:findByNameJdbc..."+name);
		String sql="select * from student where name=?";
		List<Student> list=jdbcTemplateObject.query(sql, new Object[]{name},new StudentMapperJdbc());
		if(list!=null&&list.size()>0){
			return list.get(0);
		}else{
			return null;
		}
	}
	
	public Student findByNameMybatis(String name) {
		System.out.println("Dao:findByNameMybatis..."+name);
		Student stu=studentMapperAn.findByMybatis(name);
		return stu;
	}
	
	public Student findByNameMybatisNo(String name) {
		System.out.println("Dao:findByNameMybatisNo..."+name);
		Student stu=studentMapper.findByNameMybatisNo(name);
		return stu;
	}
}
