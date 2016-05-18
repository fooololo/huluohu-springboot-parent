package com.huluohu.learning.springboot.n1.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Company        :   mamahao.com
 * author         :   guxiaolong
 * Date           :   2016/5/18
 * Time           :   17:07
 * Description    :
 */
@Component
//加载指定开头的属性
@ConfigurationProperties(prefix = "author",locations = {"classpath:/properties/author.properties"})
public class AuthorSettings {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
