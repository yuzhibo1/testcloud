package com.example.springmybatis2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Springmybatis2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springmybatis2Application.class, args);
	}

}

