package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @GetMapping("/test")
    public ResponseEntity test() {
        TestResponse response = new TestResponse("test status", 123);
        return ResponseEntity.ok(response);
    }

}
