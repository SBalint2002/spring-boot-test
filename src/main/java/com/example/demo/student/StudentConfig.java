package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.DECEMBER;
import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "Bálint",
                    "sarandi.balint@gmail.com",
                    LocalDate.of(2002, DECEMBER, 29)
            );

            Student alex = new Student(
                    "Zsombruh",
                    "zsombor@gmail.com",
                    LocalDate.of(2002, JANUARY, 10)
            );

            repository.saveAll(
                    List.of(mariam, alex)
            );
        };
    }
}
