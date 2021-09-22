package com.Transaccion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class MainTransaccion {
//transacciones cambio3
	public static void main(String[] args) {
		SpringApplication.run((MainTransaccion.class), args);
	}

}
