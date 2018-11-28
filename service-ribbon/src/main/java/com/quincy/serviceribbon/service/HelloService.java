package com.quincy.serviceribbon.service;

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

    public String hello() {
        return restTemplate.getForObject("http://service-hi/hi?name=quincy", String.class);
    }

}
