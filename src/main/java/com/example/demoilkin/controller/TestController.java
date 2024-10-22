package com.example.demoilkin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "hersey eladir";
    }
}
