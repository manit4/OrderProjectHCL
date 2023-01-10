package com.hcl.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.entity.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, String>{

}
