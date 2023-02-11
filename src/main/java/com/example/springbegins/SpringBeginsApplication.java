package com.example.springbegins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@SpringBootApplication
public class SpringBeginsApplication {

    @GetMapping("/")
    String home() {
        return "home";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBeginsApplication.class, args);
    }

}