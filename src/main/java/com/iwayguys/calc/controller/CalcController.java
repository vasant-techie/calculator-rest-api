package com.iwayguys.calc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    @GetMapping("/calc/add")
    public ResponseEntity add(@RequestParam int val1, @RequestParam int val2) {
        System.out.println("Val1: " + val2 + ", Val2: " + val2);
        return ResponseEntity.ok(val1 + val2);
    }

    @GetMapping("/calc/subtract")
    public ResponseEntity subtract(@RequestParam int val1, @RequestParam int val2) {
        System.out.println("Val1: " + val2 + ", Val2: " + val2);
        return ResponseEntity.ok(val1 - val2);
    }

    @GetMapping("/calc/multiply")
    public ResponseEntity multiply(@RequestParam int val1, @RequestParam int val2) {
        System.out.println("Val1: " + val2 + ", Val2: " + val2);
        return ResponseEntity.ok(val1 * val2);
    }

    @GetMapping("/calc/division")
    public ResponseEntity divide(@RequestParam int val1, @RequestParam int val2) {
        System.out.println("Val1: " + val2 + ", Val2: " + val2);
        return ResponseEntity.ok(val1 / val2);
    }
}
