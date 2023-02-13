package com.jenkins.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Application {
    @GetMapping("/")
    public String home() {
        return "test1111q2asd11211112·2111111111111113";
    }
}
