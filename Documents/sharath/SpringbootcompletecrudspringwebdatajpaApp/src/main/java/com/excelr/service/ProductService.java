package com.excelr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.entity.Product;
import com.excelr.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts()
	{
		return productRepository.findAll();
	}
	
	public Product getProductById(Integer ProductId)
	{
		Optional<Product> optionalProduct=productRepository.findById(ProductId);
		return optionalProduct.orElse(null);
	}
	
	public Product saveProduct(Product product)
	{
		return productRepository.save(product);
	}
	
	public void deleteProduct(Integer productId)
	{
		productRepository.deleteById(productId);
	}
	
}
