package com.ez.model2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: eworlder
 * @description:
 * @author: Mr.Yooda
 * @create: 2018-03-30 23:05
 **/
@RestController
public class Model2Home {
    @GetMapping("")
    public String ezModel(){
        //int i=0;
        //if (i==0) throw new RuntimeException();
        return "This is a Model2";
    }
}
