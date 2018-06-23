package com.vanhack.api.skipthedishes.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Restaurant {

	@Id
    @GeneratedValue()
	private long id;
	
	@Column(nullable = false)
	private String name;

	@Column
	private SegmentEnum segment;
	
	@Column
	private String address;
	
	@Column
	private double lat;
	
	@Column
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
