package com.j1808;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@SpringBootApplication
@EnableDiscoveryClient //注明这是一个消费者服务
@RibbonClients          //使用ribbon负载均衡
public class J1808ScEurekaConsumer2Application {

    public static void main(String[] args) {
        SpringApplication.run(J1808ScEurekaConsumer2Application.class, args);
    }

}
