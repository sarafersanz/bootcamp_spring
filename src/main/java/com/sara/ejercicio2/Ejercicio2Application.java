package com.sara.ejercicio2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sara.servicios.IService;

@SpringBootApplication
public class Ejercicio2Application {
	
	@Autowired
	@Qualifier("peninsular")
	IService servicePeninsular;
	
	@Autowired
	@Qualifier("insular")
	IService serviceInsular;

	public static void main(String[] args) {
		
		SpringApplication.run(Ejercicio2Application.class, args);
		
		
		
		
		//TODO
		// crear productos
		// crear 2 pedidos
		// distinguir pedido y calcular iva
		
		
	}

}
