package com.shipment.service.data;

import java.util.HashMap;
import java.util.Map;

import com.shipment.service.model.ShipmentDetails;

public class ShipmentTable {

	public static Map<Integer,ShipmentDetails> shipmentDetails=new HashMap<>();
	
	static {
		ShipmentDetails shipment1=new ShipmentDetails();
		shipment1.setOrderId(10001);
		shipment1.setShipingAddress("Bomanhalli, Virat Nagar, House No 19, 4th Main");
		shipment1.setDeliveryDate("12-July-2019");
		shipment1.setShipmentStatus("Order is Shipped");
		shipment1.setStatusMessage("Out for Delivery");
		shipment1.setTrackingId(41001);
		
		shipmentDetails.put(10001, shipment1);
		
		ShipmentDetails shipment2=new ShipmentDetails();
		shipment2.setOrderId(10002);
		shipment2.setShipingAddress("Bomanhalli, Virat Nagar, House No 19, 4th Main");
		shipment2.setDeliveryDate("10-July-2019");
		shipment2.setShipmentStatus("Delivered");
		shipment2.setStatusMessage("Delivered");
		shipment2.setTrackingId(41002);
		
		shipmentDetails.put(10002, shipment2);
	}
	
	public static ShipmentDetails getShipmentByOrderId(Integer orderId) {
		return shipmentDetails.get(orderId);
	}
}
