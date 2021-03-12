package ru.geekbrains.repository.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RepositoryClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(RepositoryClientApplication.class, args);
    }
}
