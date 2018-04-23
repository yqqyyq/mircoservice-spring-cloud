package com.application.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface TestApi {

    @RequestMapping(value="/testHello/{name}", method= RequestMethod.GET)
    public String testHello(@PathVariable("name") String name);
}