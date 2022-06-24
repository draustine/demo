package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student austine = new Student(
                    "Austine Ezemelue",
                    "draustine@yahoo.com",
                    LocalDate.of(1973, 2, 12),
                    49
            );

            Student john = new Student(
                    "John Ezemelue",
                    "john@yahoo.com",
                    LocalDate.of(1975, 5, 21),
                    49
            );

            Student ronke = new Student(
                    "Ronke Adebayo",
                    "ronke@yahoo.com",
                    LocalDate.of(2000, 12, 5),
                    49
            );

            Student bayo = new Student(
                    "Bayo Adedokun",
                    "bayo@yahoo.com",
                    LocalDate.of(1970, 11, 15),
                    49
            );

            repository.saveAll(
                    List.of(austine, john, bayo)
            );
        };
    }
}
