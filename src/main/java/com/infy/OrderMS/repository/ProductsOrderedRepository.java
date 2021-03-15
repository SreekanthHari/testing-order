package com.infy.OrderMS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.OrderMS.entity.OrderKeyID;
import com.infy.OrderMS.entity.ProductOrdered;



public interface ProductsOrderedRepository extends JpaRepository<ProductOrdered, OrderKeyID> {

	List<ProductOrdered> findByIdOrderId(int orderId);
	
	List<ProductOrdered> findByIdProdId(int prodId);
}
