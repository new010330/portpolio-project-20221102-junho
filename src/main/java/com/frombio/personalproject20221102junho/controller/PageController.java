package com.frombio.personalproject20221102junho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/index")
    public String loadIndex() {
        return "index";
    }
    
}
