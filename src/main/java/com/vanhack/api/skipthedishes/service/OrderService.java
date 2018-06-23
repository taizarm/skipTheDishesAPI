package com.vanhack.api.skipthedishes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.vanhack.api.skipthedishes.domain.Restaurant;
import com.vanhack.api.skipthedishes.domain.report.OrdersByWeek;
import com.vanhack.api.skipthedishes.domain.report.OrdersByWeek.DayOfWeek;

@Service
public class OrderService {

	private static final int MOCKED_MAX_QUANTITY_OF_ORDERS = 200;

	public List<OrdersByWeek> getOrdersByWeek(Restaurant restaurant) {
		List<OrdersByWeek> ordersByWeeks = new ArrayList<>();
		
		//This is a mocked method. 
		//Implement the real version when the API for Orders be ready.
		Random random = new Random();
		
		DayOfWeek[] daysOfWeek = OrdersByWeek.DayOfWeek.values();
		
		for (int i = 0; i < daysOfWeek.length; i++) {
			OrdersByWeek orderByWeek = new OrdersByWeek(daysOfWeek[i], random.nextInt(MOCKED_MAX_QUANTITY_OF_ORDERS));
			ordersByWeeks.add(orderByWeek);
		}
		
		return ordersByWeeks;
	}
}
