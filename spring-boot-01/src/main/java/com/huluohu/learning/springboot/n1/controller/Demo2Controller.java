package com.huluohu.learning.springboot.n1.controller;

import com.huluohu.learning.springboot.n1.config.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("demo2/")
public class Demo2Controller {
	@Autowired
	private AuthorSettings authorSettings;

	@RequestMapping("author")
	public AuthorSettings author(){
		return authorSettings;
	}
}
