package com.oop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableMongoAuditing
@SpringBootApplication
public class OopApplication {

    public static void main(String[] args) {

        SpringApplication.run(OopApplication.class, args);

        System.out.println("iniciou");

    }
}
