package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Locale;
import java.util.TimeZone;

@SpringBootApplication
public class GitTrainingSessionApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitTrainingSessionApplication.class, args);
    }


    protected static void init(){

        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale.setDefault(Locale.US);

    }

}


