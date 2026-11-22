package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${APP_MESSAGE:Hello}")
    private String message;

    @Value("${APP_VERSION:1.0}")
    private String version;

    @GetMapping("/")
    public String hello() {
        return message + " - " + version;
    }
}