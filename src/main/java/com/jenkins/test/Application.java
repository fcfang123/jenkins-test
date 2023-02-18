package com.jenkins.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Application {
    @GetMapping("/")
    public String home() {
        return "test1111q21asd11121111112·1211111s1ss11111111113";
    }
}
