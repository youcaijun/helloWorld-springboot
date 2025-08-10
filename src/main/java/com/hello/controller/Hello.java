package com.hello.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 第一个接口类
 */
@RestController
public class Hello {
    private static final Logger log = LoggerFactory.getLogger(Hello.class);
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }
}