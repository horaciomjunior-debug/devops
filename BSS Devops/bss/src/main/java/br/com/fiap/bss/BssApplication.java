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
        return "BSS SEM SEGURAN?A - FUNCIONANDO! " + java.time.LocalDateTime.now();
    }

    @GetMapping("/health")
    public String health() {
        return "OK - NO SECURITY";
    }

    @GetMapping("/test")
    public String test() {
        return "TESTE SEM SEGURAN?A";
    }

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello World API";
    }
}
