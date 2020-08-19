package com.guigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 伦
 * @create 2020-08-2020/8/19 0019-15:49
 */

@Controller
public class HelloContrller {


    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
