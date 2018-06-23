package com.vanhack.api.skipthedishes.dao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.vanhack.api.skipthedishes.domain.Restaurant;

public interface RestaurantRepository extends PagingAndSortingRepository<Restaurant, Long>{

	Page<Restaurant> findAll(Pageable pageable);
}
