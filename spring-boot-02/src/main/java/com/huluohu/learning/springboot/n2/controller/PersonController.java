package com.huluohu.learning.springboot.n2.controller;

import com.huluohu.learning.springboot.n2.dao.PersonRepository;
import com.huluohu.learning.springboot.n2.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Company        :   mamahao.com
 * author         :   guxiaolong
 * Date           :   2016/5/24
 * Time           :   18:42
 * Description    :
 */
@RestController
public class PersonController {
	@Autowired
	PersonRepository personRepository;

	@RequestMapping("/person")
	public Person save(Person person){
		Person savePerson = personRepository.save(person);
		return savePerson;
	}
}
