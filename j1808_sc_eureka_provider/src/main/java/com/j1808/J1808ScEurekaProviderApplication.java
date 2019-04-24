package com.j1808;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //标识此服务为一个提供者
public class J1808ScEurekaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(J1808ScEurekaProviderApplication.class, args);
    }

}
