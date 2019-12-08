package com.cjp.springboot.Contrllo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloContrllo {
    @ResponseBody
    @RequestMapping(value = "/hello")
    public String hello(){
        return "success";
    }
    @RequestMapping("/test")
    public String success(Map<String,Object> map){
        map.put("hello","<h1>你好<h1>");
        map.put("users", Arrays.asList("shezhang","anian","xiaoming"));
        return "success";
    }
}
