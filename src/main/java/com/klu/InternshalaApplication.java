package com.klu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.klu")
public class InternshalaApplication {
    public static void main(String[] args) {
        SpringApplication.run(InternshalaApplication.class, args);
    }
}

