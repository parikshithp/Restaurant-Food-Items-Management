package com.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.restaurant.model.FoodItem;

@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem, Integer>{
	
	@Query(value="select max(item_number) from foodmenu", nativeQuery = true)
	public Integer getItemId();

}
