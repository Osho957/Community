package com.nagarro.serviceInterface;

import com.nagarro.entity.Product;

public interface ProductServiceInterface {

	public Product saveProduct(Product product);
	
	public Product getProduct(String productCode);
	
	public void updateProductReview(Product product);
	
	public Long countAllProduct();
}
