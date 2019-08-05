package com.order.service.ribbon.client.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.order.service.ribbon.client.example.config.ShipmentServiceConfiguration;

@EnableEurekaClient
@SpringBootApplication
public class OrderServiceRibbonClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceRibbonClientApplication.class, args);
	}

}
