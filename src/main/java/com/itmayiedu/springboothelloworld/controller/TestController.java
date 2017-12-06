package com.itmayiedu.springboothelloworld.controller;


import com.itmayiedu.springboothelloworld.domain.Person;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {
    /**
     * 提供 controller + responsebody, 其中responsbody返回json格式
     *
     * @return
     */
    @RequestMapping("/hello")
    public String hello() {

        return "success!";

    }

    @RequestMapping("/")
    public String index(Model model) {
        Person single = new Person("aa", 11);
        List<Person> people = new ArrayList<>();
        Person p1 = new Person("zhangsan", 11);
        Person p2 = new Person("lisi", 22);
        Person p3 = new Person("wangwu", 33);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        model.addAttribute("singlePerson", single);
        model.addAttribute("people", people);
        return "index";
    }

}