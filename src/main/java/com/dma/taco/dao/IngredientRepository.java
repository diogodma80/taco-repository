package com.dma.taco.dao;

import org.springframework.data.repository.CrudRepository;

import com.dma.taco.entity.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}	
