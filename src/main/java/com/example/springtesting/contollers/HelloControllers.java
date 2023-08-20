package com.example.springtesting.contollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllers {

    @GetMapping("hello")
    public String hello(@RequestParam(name = "name", defaultValue = "World")  String string) {
        return "Hello " + string;
    }
}
