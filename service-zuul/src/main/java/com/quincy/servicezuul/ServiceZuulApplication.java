package com.quincy.servicezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


/**
 * 注意，springboot2.1.0版本将beanName默认重写bean由支持改为不支持，即属性在2.1.0中，
 * spring.main.allow-bean-definition-overriding默认=false。如果打开，会有很多奇奇怪怪的异常出现，
 * 但是不打开则无法启动zuul，因为在ZuulProxyAutoConfiguration中存在2个ProxyRequestHelper，由于此时不能覆盖.
 * 所以无法启动，最方便的办法就是降低版本，2.1.0 -> 2.0.3
 *
 * @author quinc
 */
@EnableZuulProxy
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class ServiceZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceZuulApplication.class, args);
    }
}
