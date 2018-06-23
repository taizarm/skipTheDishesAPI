package com.vanhack.api.skipthedishes.domain.report;

/**
 * Represents an element of the report of orders by weekday.
 * @author taiza
 *
 */
public class OrdersByWeek {

	/**
	 * Day of week
	 */
	private DayOfWeek name;
	
	/**
	 * Number of orders in this day of week
	 */
	private int orders;
	
	public enum DayOfWeek {
		SUN, MON, TUE, WED, THU, FRI, SAT;
	}
	
	public OrdersByWeek(DayOfWeek name, int orders) {
		this.name = name;
		this.orders = orders;
	}

	public DayOfWeek getName() {
		return name;
	}

	public void setName(DayOfWeek name) {
		this.name = name;
	}

	public int getOrders() {
		return orders;
	}

	public void setOrders(int orders) {
		this.orders = orders;
	}
	
	
}
