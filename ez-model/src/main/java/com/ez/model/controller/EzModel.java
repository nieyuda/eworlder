package com.ez.model.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: eworlder
 * @description:
 * @author: Mr.Yooda
 * @create: 2018-03-30 22:22
 **/

@RestController
public class EzModel {

    @GetMapping("")
    public String ezModel(){
        return "This is a Model";
    }
}
