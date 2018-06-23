package service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.vanhack.api.skipthedishes.dao.RestaurantRepository;
import com.vanhack.api.skipthedishes.domain.Restaurant;

@Service
public class RestaurantService {

	@Autowired
    private RestaurantRepository restaurantRepository;
	
	public Page<Restaurant> getAllRestaurants(Integer page, Integer size) {
		Page<Restaurant> pageOfRestaurant = restaurantRepository.findAll(PageRequest.of(page, size));
        return pageOfRestaurant;
    }
	
	public Restaurant createRestaurant(Restaurant restaurant) {
		return restaurantRepository.save(restaurant);
    }
	
	public Restaurant getRestaurant(long id) {
        Optional<Restaurant> optionalRestaurant = restaurantRepository.findById(id);
        if (optionalRestaurant.isPresent())
        	return optionalRestaurant.get();
        else
        	throw new IllegalArgumentException("api.data.not.found");
    }

    public void updateRestaurant(Restaurant restaurant) {
    	restaurantRepository.save(restaurant);
    }

    public void deleteRestaurant(Long id) {
    	restaurantRepository.deleteById(id);
    }
}
