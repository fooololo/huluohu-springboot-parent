package com.huluohu.learning.springboot.n2.domain;

import javax.persistence.*;

/**
 * Company        :   mamahao.com
 * author         :   guxiaolong
 * Date           :   2016/5/24
 * Time           :   18:24
 * Description    :
 */
@Entity
@NamedQuery(name = "Person.withNameAndAddressNamedQuery",
query = "select p from Person p where p.name=?1 and address=?2")
public class Person {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private Integer age;
	@Column(name = "address")
	private String address;

	public Person() {
	}

	public Person(String name, Integer age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
