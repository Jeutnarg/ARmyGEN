package com.kly.argen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimaryController {

    @GetMapping("/hello")
    private String getHello() {
        return "Hello to ARmyGEN!";
    }
}
