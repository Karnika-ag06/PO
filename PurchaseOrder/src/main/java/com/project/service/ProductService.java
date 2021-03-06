package com.project.service;

import java.util.List;

import com.project.model.Products;

public interface ProductService {
	
	public boolean addProduct(Products productObj);
	public List<Products> viewAllProducts();
	public boolean deleteProduct(Products productObj);
	public Products getProductByName(String productName);
	public boolean updateProduct(Products productObj);
	public Products getProductById(int productId);
}