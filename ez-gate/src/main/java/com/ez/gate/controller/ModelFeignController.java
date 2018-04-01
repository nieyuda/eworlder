package com.ez.gate.controller;

import com.ez.gate.feign.ModelFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: eworlder
 * @description:
 * @author: Mr.Yooda
 * @create: 2018-04-01 09:21
 **/
@RestController
@RequestMapping(value = "modelFeign")
public class ModelFeignController {

    @Autowired
    private ModelFeign modelFeign;

    @RequestMapping(value = "/")
    public String getHome(){
        return modelFeign.getHome();
    }

}
