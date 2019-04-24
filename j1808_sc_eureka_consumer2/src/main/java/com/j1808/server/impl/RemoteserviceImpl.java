package com.j1808.server.impl;

import com.j1808.server.Remoteservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class RemoteserviceImpl implements Remoteservice {
    @Autowired
    RestTemplate restTemplate;


    @Override
    public String fetchInfo(String name) {
        String object = restTemplate.getForObject("http://EUREKA-PROVIDER/hello?name=" + name, String.class);
        return object;
    }
}
