package com.wildcodeschool.livecodingspringjpa20200122.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcodeschool.livecodingspringjpa20200122.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
	// implementation happens automagically by Spring!
}
