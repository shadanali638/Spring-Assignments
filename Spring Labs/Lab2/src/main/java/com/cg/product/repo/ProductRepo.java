package com.cg.product.repo;

import java.util.List;

import com.cg.product.entity.Product;

public interface ProductRepo {

	
	void saveProduct(Product product);

	List<Product> getAll();
}
