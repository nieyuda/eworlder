package com.ez.gate.feign;

import com.ez.gate.feign.impl.ModelFeignImpl;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @program: eworlder
 * @description:
 * @author: Mr.Yooda
 * @create: 2018-04-01 09:12
 **/
@FeignClient(value = "ez-model",fallback = ModelFeignImpl.class)

public interface ModelFeign {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    String getHome();

}
