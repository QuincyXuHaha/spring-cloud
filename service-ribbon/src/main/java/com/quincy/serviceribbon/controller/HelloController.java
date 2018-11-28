package com.quincy.serviceribbon.controller;

import com.quincy.serviceribbon.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author quinc
 * @date 2018/11/28 星期三
 */
@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        return helloService.hello();
    }

}
