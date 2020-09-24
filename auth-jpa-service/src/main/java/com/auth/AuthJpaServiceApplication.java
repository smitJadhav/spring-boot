package com.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan(basePackages = "com.auth")
@EnableJpaRepositories(basePackages = "com.auth")
@EnableJpaAuditing
@SpringBootApplication
public class AuthJpaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthJpaServiceApplication.class, args);
	}

}
