package com.application.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.application.service.TestApi;

@RestController
public class TestControl implements TestApi {

    public String testHello(@PathVariable("name")String name) {
        return "Hello world,"+name;
    }

}