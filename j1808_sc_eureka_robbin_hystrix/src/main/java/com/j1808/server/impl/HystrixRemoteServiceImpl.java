package com.j1808.server.impl;

import com.j1808.server.HystrixRemoteService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HystrixRemoteServiceImpl implements HystrixRemoteService {

    @Autowired
    RestTemplate restTemplate;


    @Override
    @HystrixCommand(fallbackMethod = "hystrixError")
    public String fectInfo(String name) {
        String object = restTemplate.getForObject("http://EUREKA-PROVIDER/hellow?name=" + name, String.class);
        return object;
    }

    private String hystrixError(String name){
        return name+",welcome to ribbon hystrix world 10006熔断";
    }
}
