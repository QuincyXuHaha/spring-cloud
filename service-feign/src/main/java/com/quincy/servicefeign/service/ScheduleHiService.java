package com.quincy.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author quinc
 * @date 2018/11/28 星期三
 */
@FeignClient(value = "service-hi", fallback = HystricFallbackServiceImpl.class)
public interface ScheduleHiService {

    /**
     * 这里需要注意的是很多简写的东西都不能省略，比如@RequestParam,需要声明参数的形式，默认认为是将参数post
     *
     * @param name 名字
     * @return 调用结果
     */
    @GetMapping(value = "/hi")
    String hello(@RequestParam("name") String name);

}
