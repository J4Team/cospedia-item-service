package com.cospedia.itemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ItemserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemserviceApplication.class, args);
	}
}
