package com.huluohu.learning.springboot.n1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Company        :   mamahao.com
 * author         :   guxiaolong
 * Date           :   2016/5/18
 * Time           :   16:57
 * Description    :
 */
@RestController
@RequestMapping("demo1/")
public class Demo1Controller {


	@RequestMapping("book")
	public String book(){
		return "welcome to spring boot world!";
	}
}
