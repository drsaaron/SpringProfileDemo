package com.blazartech.springprofiledemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * demo of spring profiles.  Run with --spring.profiles.active=integration
 * or --spring.profiles.active=prod to get different results.
 * 
 * @author AAR1069
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
