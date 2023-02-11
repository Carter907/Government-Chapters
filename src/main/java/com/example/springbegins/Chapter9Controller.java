package com.example.springbegins;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Chapter9Controller {

    @GetMapping("/chap_9")
    String page() {
        return "chapter9";
    }

}
