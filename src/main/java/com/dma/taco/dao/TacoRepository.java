package com.dma.taco.dao;

import org.springframework.data.repository.CrudRepository;

import com.dma.taco.entity.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {

}
