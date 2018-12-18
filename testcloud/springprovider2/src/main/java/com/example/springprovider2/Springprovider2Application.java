package com.example.springprovider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Springprovider2Application {
	public static void main(String[] args) {
		SpringApplication.run(Springprovider2Application.class, args);
	}
}
