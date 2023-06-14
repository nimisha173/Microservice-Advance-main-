package com.example.hai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HaiApplication.class, args);
	}

}
