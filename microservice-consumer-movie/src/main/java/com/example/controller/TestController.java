package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/testHello/{name}")
    public String testHello(@PathVariable String name){
        return restTemplate.getForEntity("http://MICROSERVICE-PROVIDER-USER/testHello/"+name,String.class).getBody();

    }

}
