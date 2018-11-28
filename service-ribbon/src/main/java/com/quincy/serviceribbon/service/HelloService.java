package com.quincy.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author quinc
 * @date 2018/11/28 星期三
 */
@Service
public class HelloService {

    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "invokeError")
    public String hello(String name) {
        return restTemplate.getForObject("http://service-hi/hi?name=" + name, String.class);
    }

    private String invokeError(String name) {
        return name + " invoke error, start circuit breaker.";
    }

}
