package com.crud.Example2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringBootCrudExample2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudExample2Application.class, args);
	}

}
