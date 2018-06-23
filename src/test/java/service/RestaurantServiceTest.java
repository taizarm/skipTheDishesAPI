package service;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.vanhack.api.skipthedishes.dao.RestaurantRepository;
import com.vanhack.api.skipthedishes.domain.Restaurant;
import com.vanhack.api.skipthedishes.service.RestaurantService;

public class RestaurantServiceTest {

	@InjectMocks
    RestaurantService restaurantService;
	
	@Mock
	RestaurantRepository restaurantRepository;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void getRestaurant_returnRestaurant() {
		Restaurant mockRestaurant = createMockRestaurant(1L);
		Optional<Restaurant> mockReturn = Optional.of((Restaurant) mockRestaurant);
		Mockito.when(restaurantRepository.findById(1L)).thenReturn(mockReturn);
		Restaurant restaurant = restaurantService.getRestaurant(1);
		
		Assert.assertNotNull(restaurant);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void getRestaurant_throwException_whenThereIsNoRestaurantWithId() {
		Optional<Restaurant> mockReturn = Optional.ofNullable(null);
		Mockito.when(restaurantRepository.findById(1L)).thenReturn(mockReturn);
		restaurantService.getRestaurant(1);
		
		Assert.fail();
	}

	private Restaurant createMockRestaurant(Long id) {
		Restaurant restaurant = new Restaurant();
		restaurant.setId(id);
		return restaurant;
	}
}
