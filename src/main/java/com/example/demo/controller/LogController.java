package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/log")
@Slf4j
public class LogController {
    @GetMapping("/")
    public ResponseEntity<?> logTest() {
        log.info("[LogController] 로그 생성 됨");
        return ResponseEntity.status(HttpStatus.OK).body("로그 생성 됨");
    }
}
