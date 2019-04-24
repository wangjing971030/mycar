package com.j1808.server;

import org.springframework.web.bind.annotation.RequestMapping;

public interface HystrixRemoteService {

    @RequestMapping("/hellow")
    public String fectInfo(String name);
}
