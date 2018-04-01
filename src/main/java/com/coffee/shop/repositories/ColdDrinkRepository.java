package com.coffee.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coffee.shop.entities.menuitems.ColdDrink;

public interface ColdDrinkRepository extends JpaRepository<ColdDrink, String>{

}
