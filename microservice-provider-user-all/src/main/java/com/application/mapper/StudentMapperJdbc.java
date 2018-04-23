package com.application.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.application.entity.Student;
import org.springframework.jdbc.core.RowMapper;

public class StudentMapperJdbc implements RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student stu=new Student();
		stu.setID(rs.getString("ID"));
		stu.setName(rs.getString("name"));
		stu.setPassword(rs.getString("password"));
		stu.setAge(rs.getInt("age"));
		stu.setRemark(rs.getString("remark"));
		
		return stu;
	}

}
