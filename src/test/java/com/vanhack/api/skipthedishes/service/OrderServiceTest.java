package com.vanhack.api.skipthedishes.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.vanhack.api.skipthedishes.domain.Restaurant;
import com.vanhack.api.skipthedishes.domain.report.OrdersByWeek;

public class OrderServiceTest {

    OrderService orderService = new OrderService();
	
	@Test
	public void getOrdersByWeek_returnAllDays() {
		Restaurant mockRestaurant = new Restaurant();
		
		List<OrdersByWeek> ordersByWeek = orderService.getOrdersByWeek(mockRestaurant);
		
		int expectedSize = OrdersByWeek.DayOfWeek.values().length;
		
		Assert.assertEquals(expectedSize, ordersByWeek.size());
	}
}
