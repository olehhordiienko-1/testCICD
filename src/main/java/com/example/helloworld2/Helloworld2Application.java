package com.example.helloworld2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@SpringBootApplication
public class Helloworld2Application {

    public static void main(String[] args) {
        SpringApplication.run(Helloworld2Application.class, args);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String index() {
        return "Hello World " + LocalDateTime.now();
    }

}
