package com.example.sofabootswagger3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.example"})
public class SofabootSwagger3Application {

    public static void main(String[] args) {
        SpringApplication.run(SofabootSwagger3Application.class, args);
    }

}
