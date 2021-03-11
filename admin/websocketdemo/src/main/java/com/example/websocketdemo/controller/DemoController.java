package com.example.websocketdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Slf4j
@Controller
public class DemoController {

    public static HashMap<String,String> users = new HashMap<>();

    @CrossOrigin(origins = "*",maxAge = 3600)
    @GetMapping("/login/{username}")
    public String demo(@PathVariable("username") String username){
        log.info("登陆成功,用户名:{}",username);
        if (username!=null){
            users.put(username,"1");
        }else {
            users.put(String.valueOf(Math.random()*10),"username");
        }
        return "demo";
    }

    @CrossOrigin
    @GetMapping("/username")
    @ResponseBody
    public String getUsername(){
        return "";
    }

}
