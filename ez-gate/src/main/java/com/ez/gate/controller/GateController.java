package com.ez.gate.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: eworlder
 * @description: 访问控制器
 * @author: Mr.Yooda
 * @create: 2018-03-30 10:40
 **/
@RestController
public class GateController {

    private Logger logger = LoggerFactory.getLogger(GateController.class);

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("")
    public String home(){
        return "ez-gate model";
    }

    @GetMapping("/model")
    public String model(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("ez-model");
        String url = "http://"+serviceInstance.getHost()+":"+serviceInstance.getPort();
        logger.info("url:{}",url);
        String result = restTemplate.getForObject(url,String.class);
        return result;
    }


}
