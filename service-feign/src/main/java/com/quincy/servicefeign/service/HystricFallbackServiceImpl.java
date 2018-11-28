package com.quincy.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @author quinc
 * @date 2018/11/28 星期三
 */
@Component
public class HystricFallbackServiceImpl implements ScheduleHiService {
    @Override
    public String hello(String name) {
        return name + " use feign invoke error, start fallback";
    }
}
