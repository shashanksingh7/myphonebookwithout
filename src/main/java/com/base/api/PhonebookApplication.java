package com.base.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EntityScan("com.base.entity")
@EnableJpaRepositories("com.base.repository")
@ComponentScan(basePackages={"com.base"})
@EnableWebMvc

public class PhonebookApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(PhonebookApplication.class, args);
	}

}
