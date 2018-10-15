package com.food.springBootWithElasticsearch.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.food.springBootWithElasticsearch.model.Fooditems;

@Repository
public interface FoodItemRepository extends ElasticsearchRepository<Fooditems, String> {

	List<Fooditems> findByName(String name);
}
