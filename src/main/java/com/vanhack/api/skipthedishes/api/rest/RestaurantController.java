package com.vanhack.api.skipthedishes.api.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vanhack.api.skipthedishes.domain.Restaurant;
import com.vanhack.api.skipthedishes.domain.report.OrdersByWeek;
import com.vanhack.api.skipthedishes.service.OrderService;
import com.vanhack.api.skipthedishes.service.RestaurantService;

@RestController
@RequestMapping(value = "/ilovefood/v1/restaurants")
public class RestaurantController {

	private static final String DEFAULT_PAGE_NUM = "0";
	private static final String DEFAULT_PAGE_SIZE = "10";
	
	@Autowired
    private RestaurantService restaurantService;

	@Autowired
    private OrderService orderService;

	@RequestMapping(value = "",
            method = RequestMethod.GET,
            produces = {"application/json", "application/json"})
    @ResponseStatus(HttpStatus.OK)
    public
    @ResponseBody
    Page<Restaurant> getRestaurants(
    		@RequestParam(value = "page", required = true, defaultValue = DEFAULT_PAGE_NUM) Integer page,
    		@RequestParam(value = "size", required = true, defaultValue = DEFAULT_PAGE_SIZE) Integer size,
    		HttpServletRequest request, 
    		HttpServletResponse response) {
        return this.restaurantService.getAllRestaurants(page, size);
    }
	
    @RequestMapping(value = "",
            method = RequestMethod.POST,
            consumes = {"application/json"},
            produces = {"application/json"})
    @ResponseStatus(HttpStatus.CREATED)
    public void createHotel(@RequestBody Restaurant restaurant,
                                 HttpServletRequest request, 
                                 HttpServletResponse response) {
    	Restaurant newRestaurant = this.restaurantService.createRestaurant(restaurant);
        response.setHeader("Location", request.getRequestURL().append("/").append(newRestaurant.getId()).toString());
    }
    
	@RequestMapping(value = "/{id}/orders/weekly_report",
            method = RequestMethod.GET,
            produces = {"application/json", "application/json"})
    @ResponseStatus(HttpStatus.OK)
    public
    @ResponseBody
    List<OrdersByWeek> getOrdersWeeklyReport(
    		@PathVariable("id") Long id, 
    		HttpServletRequest request, HttpServletResponse response) {
		
         Restaurant restaurant = this.restaurantService.getRestaurant(id);
         return this.orderService.getOrdersByWeek(restaurant);
    }
}
