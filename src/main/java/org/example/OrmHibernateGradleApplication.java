package org.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.example.service.SeedService;

@SpringBootApplication
public class OrmHibernateGradleApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrmHibernateGradleApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(SeedService seedService) {
        return args -> seedService.seed();
    }
}
