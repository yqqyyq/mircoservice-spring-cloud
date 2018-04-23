package com.example.controller;

import com.example.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    private String userServiceUrl="http://localhost:8081/mybatis/";

    @GetMapping("/mybatisnoclient/{name}")
    public Student findById(@PathVariable String name){
        String url=this.userServiceUrl+name;
        System.out.println(url);
        return this.restTemplate.getForObject(url,Student.class);
    }


}
