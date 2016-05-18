package com.huluohu.learning.springboot.n2.controller;

import com.huluohu.learning.springboot.n2.vo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huluohu on 2016/5/19.
 */
@Controller
public class Demo1Controller {
    @RequestMapping("/")
    public String index(Model model){
        Person single = new Person("aa", 11);

        List<Person> persons = new ArrayList<>();
        Person p1 = new Person("xx", 11);
        Person p2 = new Person("yy", 12);
        Person p3 = new Person("zz", 13);

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        model.addAttribute("singlePerson",single);
        model.addAttribute("people",persons);
        return "index";
    }
}
