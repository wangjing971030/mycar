package com.j1808.controller;

import com.j1808.service.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    RemoteService remoteService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(@RequestParam("name") String name){
        String info = remoteService.getInfo(name);
        return info;

    }
}
