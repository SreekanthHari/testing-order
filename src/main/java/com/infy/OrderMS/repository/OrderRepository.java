package com.infy.OrderMS.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.OrderMS.entity.OrderDetails;





public interface OrderRepository extends JpaRepository<OrderDetails, Integer> {

	Optional<OrderDetails> findBybuyerId(int orderId);
}
