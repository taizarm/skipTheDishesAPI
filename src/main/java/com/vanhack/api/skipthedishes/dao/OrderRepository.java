package com.vanhack.api.skipthedishes.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.vanhack.api.skipthedishes.domain.RestaurantOrder;

public interface OrderRepository extends PagingAndSortingRepository<RestaurantOrder, Long>{

}
