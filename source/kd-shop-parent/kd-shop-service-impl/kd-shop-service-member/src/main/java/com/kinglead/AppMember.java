package com.kinglead;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author kinglead
 * @date 2020-12-23 上午 11:32
 * @describe {请写具体描述}
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableSwagger2Doc
public class AppMember {

    public static void main(String[] args) {
        SpringApplication.run(AppMember.class, args);
    }

}
