package com.dma.taco.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Ingredient {

	@Id
	private final String id;
	private final String name;
	private final String kind;


	
}
