package com.huluohu.springboot.starter.hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by huluohu on 2016/5/18.
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {
    private static final String MSG = "world";
    private String msg = MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
