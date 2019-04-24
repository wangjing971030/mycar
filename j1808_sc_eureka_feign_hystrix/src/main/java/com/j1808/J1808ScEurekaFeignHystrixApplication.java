package com.j1808;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient //标识此服务为消费者
@EnableFeignClients  //以feign实现调用的负载均衡
@EnableHystrix        //启动熔断   必须配置yml里的feign:hystrix:enabled: true否则熔断器失效，若果不加注解则一直熔断
public class J1808ScEurekaFeignHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(J1808ScEurekaFeignHystrixApplication.class, args);
    }

}
