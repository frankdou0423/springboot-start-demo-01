package com.gtfrank.springboot.controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @ProjectName: springbootstartdemo01
 * @Package: com.gtfrank.springboot.controller
 * @ClassName: IndexController
 * @Author: frank
 * @Description: 测试springboot启动方式
 * @Date: 2019/11/20 11:11
 * @Version: 1.0
 */
@RestController
@SpringBootApplication
public class IndexController {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String index(){
        return "hello";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(Map<String,Object> map){
        return "redirect:/text";
    }
    public static void main(String[] args) {
        //这里是springboot的入口函数
        SpringApplication.run(IndexController.class,args);
    }
}
