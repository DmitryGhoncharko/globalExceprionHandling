package com.example.globalexceprionhandling.contoller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/exception/handle")
public class TestController {

    @GetMapping
    public ResponseEntity<String> handleExceptionTest(){
     throw new RuntimeException("TEST EXCEPTION HANDLER");
    }
}

