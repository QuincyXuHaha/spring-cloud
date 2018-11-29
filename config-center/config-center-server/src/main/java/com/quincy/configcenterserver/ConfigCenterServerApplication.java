package com.quincy.configcenterserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * http请求地址和资源文件映射如下:
 * <p>
 * /{application}/{profile}[/{label}]
 * /{application}-{profile}.yml
 * /{label}/{application}-{profile}.yml
 * /{application}-{profile}.properties
 * /{label}/{application}-{profile}.properties
 *
 * @author quinc
 */
@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class ConfigCenterServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterServerApplication.class, args);
    }
}
