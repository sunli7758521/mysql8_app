package com.kangning.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author sunli
 * @Date 2020/1/17
 */
@RestController
@RequestMapping("/test")
public class Controller {

    @RequestMapping("/index")
    public String test(){
        return "123";
    }
}
