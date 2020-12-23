package com.kinglead;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author kinglead
 * @date 2020-12-23 上午 11:05
 * @describe {请写具体描述}
 */
@SpringBootApplication
@EnableEurekaClient
public class AppWeiXin {

    public static void main(String[] args) {
        SpringApplication.run(AppWeiXin.class, args);
    }

}
