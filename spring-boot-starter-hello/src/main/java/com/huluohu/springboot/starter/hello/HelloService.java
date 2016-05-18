package com.huluohu.springboot.starter.hello;

/**
 * Created by huluohu on 2016/5/18.
 */
public class HelloService {
    private String msg;

    public String sayHello(){
        return "hello " + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
