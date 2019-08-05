package com.shipment.service.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shipment.service.data.ShipmentTable;
import com.shipment.service.model.ShipmentDetails;

@RestController
public class ShipmentResource {

	@GetMapping(value="/shipment-details/{orderid}")
	public ResponseEntity<ShipmentDetails> getShipmentDetailsByOrderId(@PathVariable("orderid") Integer orderId){
		ShipmentDetails shipment=ShipmentTable.getShipmentByOrderId(orderId);
		return ResponseEntity.ok(shipment);
	}
}
