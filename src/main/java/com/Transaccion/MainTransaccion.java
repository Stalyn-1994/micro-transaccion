package com.Transaccion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class MainTransaccion {

	public static void main(String[] args) {
		SpringApplication.run((MainTransaccion.class), args);
	}

}
