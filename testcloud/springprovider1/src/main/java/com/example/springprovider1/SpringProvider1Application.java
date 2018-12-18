package com.example.springprovider1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringProvider1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringProvider1Application.class, args);
	}
}
