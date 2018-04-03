package com.coffee.shop.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coffee.shop.entities.menuitems.HotDrink;

@Repository
public interface HotDrinkRepository extends JpaRepository<HotDrink, String>{
	
	List<HotDrink> findAllByType(String type);
}
