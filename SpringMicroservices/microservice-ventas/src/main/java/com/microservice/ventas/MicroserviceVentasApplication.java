package com.microservice.ventas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceVentasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceVentasApplication.class, args);
	}

}
