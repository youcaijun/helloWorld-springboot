package com.hello.controller;

import org.springframework.web.bind.annotation.*;


/**
 *
 * 测试回声类
 *
 */
@RestController
@RequestMapping("/api/echo")
public class Echo {

    @GetMapping
    public String echoGet(@RequestParam(required = false) String message) {
        System.out.println("123");
        if(message==null){
            message="null";
        }
        return message;
    }

    @PostMapping
    public String echoPost(@RequestBody String message) {
        return "ECHO: " + message;
    }
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }
}