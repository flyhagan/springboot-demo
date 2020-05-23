package com.hg.transation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Loginin {
    @Autowired
    private Environment environment;
    @RequestMapping("/blog")
    public String login(){
        return environment.getProperty("url").toString();
    }
}
