package com.haruma.demowebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from DemoWebApp!";
    }

    @GetMapping("/square/{n}")
    public int square(@PathVariable int n) {
        return n * n;
    }

    @GetMapping("/testbean")
    public Map<String, String> jsonBean() {
        return new ExtendableBean().getProperties();
    }
}
