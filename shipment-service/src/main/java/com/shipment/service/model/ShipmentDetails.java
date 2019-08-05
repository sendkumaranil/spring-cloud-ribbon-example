package com.shipment.service.model;

public class ShipmentDetails {

	private Integer trackingId;
	private Integer orderId;
	private String shipingAddress;
	private String statusMessage;
	private String deliveryDate;
	private String shipmentStatus;
	
	public Integer getTrackingId() {
		return trackingId;
	}
	public void setTrackingId(Integer trackingId) {
		this.trackingId = trackingId;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getShipingAddress() {
		return shipingAddress;
	}
	public void setShipingAddress(String shipingAddress) {
		this.shipingAddress = shipingAddress;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getShipmentStatus() {
		return shipmentStatus;
	}
	public void setShipmentStatus(String shipmentStatus) {
		this.shipmentStatus = shipmentStatus;
	}
}
