package com.huluohu.learning.springboot.n1.controller;

import com.huluohu.springboot.starter.hello.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huluohu on 2016/5/18.
 */
@RestController
public class Demo3Controller {
    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/demo3",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public String say(){
        return helloService.sayHello();
    }
}
