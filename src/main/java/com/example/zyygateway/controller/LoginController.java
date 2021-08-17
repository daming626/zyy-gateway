package com.example.zyygateway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller //返回的字符串为要跳转的页面 html的名称
@RestController //单纯返回字符串，无页面跳转
public class LoginController {
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("test1")
    public String test1(){
        return "亲，欢迎来到 spring security";
    }

    @GetMapping("test2")
    public String Test2(){
        return "test";
    }
}
