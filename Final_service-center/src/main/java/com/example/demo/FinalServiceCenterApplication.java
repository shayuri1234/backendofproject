package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.symbiosis","com.dao","com.service","com.controller","com.model"})
@EntityScan("com.model")
@EnableJpaRepositories(basePackages="com.dao")
public class FinalServiceCenterApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FinalServiceCenterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
