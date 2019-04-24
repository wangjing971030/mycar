package com.j1808.server.impl;

import com.j1808.server.HystrixRemoteService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class HystrixRemoteServiceImpl implements HystrixRemoteService {


    public String getInfo(String name){

        return name+",welcome to spring cloud world xxx";
    }

}
