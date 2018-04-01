package com.ez.gate.feign.impl;

import com.ez.gate.feign.ModelFeign;

/**
 * @program: eworlder
 * @description: Feign客户端调用失败，返回实例
 * @author: Mr.Yooda
 * @create: 2018-04-01 09:53
 **/

public class ModelFeignImpl implements ModelFeign {
    @Override
    public String getHome() {
        return "hystrix getHome 失败";
    }
}
