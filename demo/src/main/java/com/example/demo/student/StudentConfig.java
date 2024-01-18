package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.MARCH;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student newrich = new Student(
                    "Newrich",
                    "newrich.oyuga@gmail.com",
                    LocalDate.of(2001, MARCH, 2)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, MARCH, 2)
            );

            repository.saveAll(
                    List.of(newrich, alex)
            );
        };
    }
}
