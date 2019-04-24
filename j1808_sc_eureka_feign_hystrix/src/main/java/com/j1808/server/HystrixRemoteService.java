package com.j1808.server;

import com.j1808.server.impl.HystrixRemoteServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//当远程服务调用失败回调HystrixRemoteServiceImpl的实现
@FeignClient(name="eureka-provider",fallback = HystrixRemoteServiceImpl.class)
public interface HystrixRemoteService {
    @RequestMapping("hellow")
    public  String getInfo(@RequestParam("name") String name);
}
