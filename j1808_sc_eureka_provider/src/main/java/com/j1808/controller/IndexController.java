package com.j1808.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {


    @RequestMapping("/hellow")
    public String sayHellow(String name){
        return name+",welcome to spring cloud world  xxx";
    }
}
