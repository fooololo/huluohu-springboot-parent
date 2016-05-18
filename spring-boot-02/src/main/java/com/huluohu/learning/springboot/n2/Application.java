package com.huluohu.learning.springboot.n2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by huluohu on 2016/5/18.
 */
@SpringBootApplication(scanBasePackages = {"com.huluohu.learning.springboot.n2"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
