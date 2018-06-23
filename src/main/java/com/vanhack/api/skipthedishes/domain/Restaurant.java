package com.vanhack.api.skipthedishes.domain;


public class Restaurant {

	private long id;
	
	private String name;

	private SegmentEnum segment;
	
	private String address;
	
	private double lat;
	
	private double lng;
	
	public enum SegmentEnum {
		PIZZA("Pizza"),
		BARBECURE("Barbecue"),
		LIGHT("Light");
		
		private SegmentEnum(String description) {
			this.description = description;
		}

		private String description;

		public String getDescription() {
			return description;
		}

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SegmentEnum getSegment() {
		return segment;
	}

	public void setSegment(SegmentEnum segment) {
		this.segment = segment;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}
	
}
