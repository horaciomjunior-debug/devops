package br.com.fiap.bss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BssApplication {

    public static void main(String[] args) {
        SpringApplication.run(BssApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "BSS ULTRA SIMPLE - FUNCIONANDO! " + java.time.LocalDateTime.now();
    }

    @GetMapping("/ping")
    public String ping() {
        return "PONG";
    }

    @GetMapping("/test")
    public String test() {
        return "TEST DIRECT IN MAIN CLASS";
    }
}
