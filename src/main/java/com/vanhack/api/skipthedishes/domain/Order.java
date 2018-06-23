package com.vanhack.api.skipthedishes.domain;

import java.util.Date;

public class Order {

	private long id;
	
	private Restaurant restaurant;
	
	private User client;
	
	private User courier;

	private Date orderTimestamp;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}

	public User getCourier() {
		return courier;
	}

	public void setCourier(User courier) {
		this.courier = courier;
	}

	public Date getOrderTimestamp() {
		return orderTimestamp;
	}

	public void setOrderTimestamp(Date orderTimestamp) {
		this.orderTimestamp = orderTimestamp;
	}

}
