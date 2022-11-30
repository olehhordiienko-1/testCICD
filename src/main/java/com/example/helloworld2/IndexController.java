package com.example.helloworld2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
public class IndexController {
    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World " + LocalDateTime.now();
    }
}
