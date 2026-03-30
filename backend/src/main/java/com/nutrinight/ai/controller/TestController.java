package com.nutrinight.ai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String home() {
        return "NutriNight AI backend is running successfully";
    }

    @GetMapping("/test")
    public String test() {
        return "Step 1 completed successfully";
    }
}