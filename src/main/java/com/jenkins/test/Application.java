package com.jenkins.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Application {
    @GetMapping("/")
    public String home() {
        System.out.println("i am branch-1");
        return "test1111q211asd111211111112·1211111s1ss11111111113";
    }
}
