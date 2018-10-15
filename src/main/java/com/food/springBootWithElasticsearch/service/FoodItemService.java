package com.food.springBootWithElasticsearch.service;

import java.util.List;
import java.util.Optional;

import com.food.springBootWithElasticsearch.model.Fooditems;

public interface FoodItemService {

	Optional<Fooditems> findOne(String id);
	
    Iterable<Fooditems> findAll();
    
    List<Fooditems> findByName(String name);
}
