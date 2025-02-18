package com.nth.springeurekaimage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringEurekaImageApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaImageApplication.class, args);
	}

}
