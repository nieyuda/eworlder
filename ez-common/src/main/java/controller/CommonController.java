package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: eworlder
 * @description: 通用类控制器
 * @author: Mr.Yooda
 * @create: 2018-03-30 09:28
 **/
@RestController
public class CommonController {

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String index(){
        return "Common Model!";
    }
}
