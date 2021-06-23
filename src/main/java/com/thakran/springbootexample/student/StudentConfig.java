package com.thakran.springbootexample.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student ram = new Student(
                    "Ram",
                    "ram@gmail.com",
                    LocalDate.of(2000, JANUARY, 20)
            );
            Student laxman = new Student(
                    "Laxman",
                    "laxman@gmail.com",
                    LocalDate.of(2004, MAY, 2)
            );

            repository.saveAll(
                    List.of(ram,laxman)
            );
        };
    }
}
