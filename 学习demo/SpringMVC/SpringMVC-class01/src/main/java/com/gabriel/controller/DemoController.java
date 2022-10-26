package com.gabriel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @RequestMapping("/method")
    public String method(){
        System.out.println("这是Controller");

        return "new";
    }
}
