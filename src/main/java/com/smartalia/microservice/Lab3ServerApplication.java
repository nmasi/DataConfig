package com.smartalia.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Lab3ServerApplication {

	public static void main(String[] args1) {
		SpringApplication.run(Lab3ServerApplication.class, args1);
	}
}
