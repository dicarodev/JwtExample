package com.dicarodev.jwtimplementation.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo_controller")
public class DemoController {

    @GetMapping
    public ResponseEntity<String> greetings() {
        return ResponseEntity.ok("Secured endpoint");
    }
}
