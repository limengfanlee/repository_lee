package com.springbootdemo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootApplication {

    @ResponseBody
    @RequestMapping("/xxx")
    public static  String xxx(){
        return  "aaa";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
