package com.example.demorest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DemorestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemorestApplication.class, args);
	}

}
