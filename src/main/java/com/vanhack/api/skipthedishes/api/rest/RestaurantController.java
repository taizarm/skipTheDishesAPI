package com.vanhack.api.skipthedishes.api.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vanhack.api.skipthedishes.domain.Restaurant;
import com.vanhack.api.skipthedishes.service.RestaurantService;

@RestController
@RequestMapping(value = "/ilovefood/v1/restaurants")
public class RestaurantController {

	private static final String DEFAULT_PAGE_NUM = "0";
	private static final String DEFAULT_PAGE_SIZE = "10";
	
	@Autowired
    private RestaurantService restaurantService;
	
	@RequestMapping(value = "",
            method = RequestMethod.GET,
            produces = {"application/json", "application/json"})
    @ResponseStatus(HttpStatus.OK)
    public
    @ResponseBody
    Page<Restaurant> getRestaurants(
    		@RequestParam(value = "page", required = true, defaultValue = DEFAULT_PAGE_NUM) Integer page,
    		@RequestParam(value = "size", required = true, defaultValue = DEFAULT_PAGE_SIZE) Integer size,
    		HttpServletRequest request, HttpServletResponse response) {
        return this.restaurantService.getAllRestaurants(page, size);
    }
	
}
