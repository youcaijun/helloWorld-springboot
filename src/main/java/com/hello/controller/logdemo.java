package com.hello.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;


/**
 *
 * 日志类demo
 */
@RestController
public class logdemo {
    private static final Logger log = LoggerFactory.getLogger(logdemo.class);
    @GetMapping("/log")
    public String sayHello() {
        log.trace("详细跟踪信息");
        log.debug("调试信息 - 仅开发环境可见");
        log.info("业务操作记录: 用户ID={}", 12345);
        log.warn("警告: 资源使用率过高");
        log.error("错误: 数据库连接失败", new SQLException("连接超时"));
        return "Hello World!";
    }
}