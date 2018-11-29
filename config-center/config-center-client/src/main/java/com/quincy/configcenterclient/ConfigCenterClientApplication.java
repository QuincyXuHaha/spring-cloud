package com.quincy.configcenterclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@EnableEurekaClient
@RestController
@SpringBootApplication
public class ConfigCenterClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterClientApplication.class, args);
    }

    @Value("${foo}")
    private String foo;

    @GetMapping("/hello")
    public String hello() {
        return "hello, i am " + foo;
    }

}
