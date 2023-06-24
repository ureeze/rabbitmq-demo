package com.example.demorabbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class DemoRabbitApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoRabbitApplication.class, args);
    }

}
