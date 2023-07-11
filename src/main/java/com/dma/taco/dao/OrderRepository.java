package com.dma.taco.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dma.taco.entity.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

}
