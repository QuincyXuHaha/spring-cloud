package com.quincy.servicefeign.controller;

import com.quincy.servicefeign.service.ScheduleHiService;
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
    private ScheduleHiService scheduleHiService;

    @GetMapping("/hello")
    public String hello(String name) {
        return scheduleHiService.hello(name);
    }

}
