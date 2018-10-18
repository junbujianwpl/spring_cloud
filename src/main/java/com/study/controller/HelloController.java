package com.study.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这里@RestController = @ Controller + @ ResponseBody，
 * 
 * 会将方法的返回结果直接放入http 返回报文的正文部分，直接显示到页面
 *
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello() {
        return "hello ,spring boot";
    }
}
