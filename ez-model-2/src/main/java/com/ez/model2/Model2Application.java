package com.ez.model2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: eworlder
 * @description:
 * @author: Mr.Yooda
 * @create: 2018-03-30 22:57
 **/
@SpringBootApplication
@EnableEurekaClient
public class Model2Application {
    public static void main(String[] args) {
        SpringApplication.run(Model2Application.class,args);
    }
}
