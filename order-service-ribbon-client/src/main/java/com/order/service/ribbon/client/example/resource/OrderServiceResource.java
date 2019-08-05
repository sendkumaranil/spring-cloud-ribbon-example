package com.order.service.ribbon.client.example.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.order.service.ribbon.client.example.config.ShipmentServiceConfiguration;

@RestController
@RequestMapping("/orders-details")
@RibbonClient(name="shipment-a-service",configuration=ShipmentServiceConfiguration.class)
public class OrderServiceResource {

	@Autowired
	RestTemplate restTemplate ;
	
	@GetMapping("/shipment/{orderid}")
	public String getShipmentByOrderId(@PathVariable("orderid") Integer orderId) {
	
		String url="http://shipment-service/shipment-details/{orderid}";
		String response=restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<String>() {},orderId).getBody();
		return response;
	}
	
	@LoadBalanced
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
