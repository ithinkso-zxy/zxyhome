package com.zxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("index")
public class IndexController {
    @RequestMapping("/info")
    public String info(){
        System.out.println("奥利给");
        return "/calmlog-index";
    }
}
