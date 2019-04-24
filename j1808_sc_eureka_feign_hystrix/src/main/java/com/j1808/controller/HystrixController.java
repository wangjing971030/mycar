package com.j1808.controller;

import com.j1808.server.HystrixRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {
    @Autowired
    HystrixRemoteService hystrixRemoteService;
    @RequestMapping("/login")
    public String login(@RequestParam("name") String name){
        return hystrixRemoteService.getInfo(name+"07");
    }

}
