package br.com.fiap.bss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    
    @GetMapping("/hello")
    public String hello() {
        return "HELLO BSS - FUNCIONANDO!";
    }
    
    @GetMapping("/")
    public String home() {
        return "BSS Application RUNNING - " + java.time.LocalDateTime.now();
    }
    
    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
