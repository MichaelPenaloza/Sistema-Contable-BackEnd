package com.microservice.contabilidad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceContabilidadApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceContabilidadApplication.class, args);
	}

}
