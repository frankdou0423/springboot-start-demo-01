package com.gtfrank.springboot.controller;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@SpringBootApplication
public class IndexController {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String index(){
        //返回值可以是string也可以是其他的
        return "hello";
    }
    /**
     * @description:
     * @param map
     * @return: String
     * @author: frank
     * @time: 2019/11/21 15:26
     */
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(Map<String,Object> map){
        return "redirect:/text";
    }

}
