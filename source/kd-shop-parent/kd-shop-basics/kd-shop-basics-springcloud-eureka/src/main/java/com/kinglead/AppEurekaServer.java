package com.kinglead;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author kinglead
 * @date 2020-12-22 下午 20:45
 * @describe {请写具体描述}
 */
@SpringBootApplication
@EnableEurekaServer
public class AppEurekaServer {

    public static void main(String[] args) {
        SpringApplication.run(AppEurekaServer.class, args);
    }

}
