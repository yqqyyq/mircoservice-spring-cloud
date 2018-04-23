package com.example.controller;

import com.example.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieClientController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${user.userPathUrl}")
    private String userPathUrl;

    @GetMapping("/jpa/{name}")
    public Student findByNameJpa(@PathVariable String name){
        return restTemplate.getForEntity(this.userPathUrl+"/jpa/"+name,Student.class).getBody();

    }

    @GetMapping("/jdbc/{name}")
    public Student findByNameJdbc(@PathVariable String name){
        return restTemplate.getForEntity(this.userPathUrl+"/jdbc/"+name,Student.class).getBody();

    }

    @GetMapping("/mybatis/{name}")
    public Student findByNameMybatis(@PathVariable String name){
        return restTemplate.getForEntity(this.userPathUrl+"/mybatis/"+name,Student.class).getBody();

    }

    @GetMapping("/mybatisno/{name}")
    public Student findByNameMybatisNo(@PathVariable String name){
        return restTemplate.getForEntity(this.userPathUrl+"/mybatisno/"+name,Student.class).getBody();
    }

}
