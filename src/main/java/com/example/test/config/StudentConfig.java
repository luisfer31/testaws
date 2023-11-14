package com.example.test.config;

import com.example.test.model.entity.Student;
import com.example.test.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student luis_m = new Student(
                    1L,
                    "Luis M",
                    "luis@gmail.com",
                    LocalDate.of(1978, Month.APRIL, 02)
            );

            Student vale_m = new Student(
                    2L,
                    "Vale M",
                    "vale@gmail.com",
                    LocalDate.of(2017, Month.APRIL, 20)
            );
            studentRepository.saveAll(List.of(luis_m, vale_m));
        };
    }
}
