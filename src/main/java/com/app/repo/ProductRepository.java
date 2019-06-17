package com.app.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Product1;

public interface ProductRepository extends JpaRepository<Product1, Integer>{

	interface ViewA{
		String getProdCode();
		String prodModel();
	}
	
	interface ViewB{
		String prodVendor();
		Double prodCost();
	}
	List<Product1> findByProdCost(Double prodCost);
	List<Product1> findByProdCode(String prodCode);
}
