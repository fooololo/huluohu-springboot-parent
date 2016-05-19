package com.huluohu.learning.springboot.n2.core.converter;

/**
 * Company        :   mamahao.com
 * author         :   guxiaolong
 * Date           :   2016/5/17
 * Time           :   18:01
 * Description    :
 */
public class DemoObj {
	private Long id;
	private String name;

	public DemoObj() {
	}

	public DemoObj(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
