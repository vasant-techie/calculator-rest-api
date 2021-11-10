package com.iwayguys.calc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Calculator {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Calculator.class);
    }
}
