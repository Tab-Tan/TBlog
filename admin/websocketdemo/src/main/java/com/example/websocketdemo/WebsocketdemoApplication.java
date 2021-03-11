package com.example.websocketdemo;

import com.example.websocketdemo.demo.StringDemo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@SpringBootApplication
public class WebsocketdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebsocketdemoApplication.class, args);
    }

    @Bean
    public ApplicationRunner getUsername(StringDemo demo,@Value("${name:tabtan}") String name){
        return args -> {
            demo.setUsername(name);
            System.out.println(demo.getUsername());
        };
    }
}
