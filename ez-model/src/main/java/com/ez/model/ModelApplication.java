package com.ez.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: eworlder
 * @description: 可扩展应用模块
 * @author: Mr.Yooda
 * @create: 2018-03-30 10:57
 **/
@SpringBootApplication
@EnableEurekaClient
public class ModelApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModelApplication.class,args);
    }

}
