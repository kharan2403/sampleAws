package com.example.sampleAws.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/greet")
    public ResponseEntity<String> greet(){
        String msg ="Welcome to AWS CodeBuild Demo!!!!";
        return  new ResponseEntity<>(msg, HttpStatus.OK);
    }

    @GetMapping("/bye")
    public ResponseEntity<String> bye(){
        String msg ="bye to AWS CodeBuild Demo!!!!";
        return  new ResponseEntity<>(msg, HttpStatus.OK);
    }
}
