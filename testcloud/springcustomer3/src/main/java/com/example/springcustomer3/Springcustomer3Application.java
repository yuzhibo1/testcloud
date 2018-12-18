package com.example.springcustomer3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Springcustomer3Application {

	public static void main(String[] args) {
		SpringApplication.run(Springcustomer3Application.class, args);
	}
}
