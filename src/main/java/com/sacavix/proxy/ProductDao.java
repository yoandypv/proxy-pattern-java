package com.sacavix.proxy;

public interface ProductDao {
	public Product findById(Long id);
	public Product save(Product product);
}
