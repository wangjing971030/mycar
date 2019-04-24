package com.j1808.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="eureka-provider")
public interface RemoteService {



    @RequestMapping("/hellow")
    public String getInfo(@RequestParam("name") String name);
}
