package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bean.ProductBean;
import com.entity.ProductEntity;
import com.repository.ProductRepository;

@RestController
public class ProductController {

	
	@Autowired
	ProductRepository productRepository;
	
	// add product
	@PostMapping("/products")
	public ProductEntity addProduct(@RequestBody ProductEntity product) {
		System.out.println(product.getProductName());
		System.out.println(product.getCategory());
		productRepository.save(product);
		return product;
	}
}
//rest client ->POST MAN 
  
//jdbc : 
	// spring data jdbc 
	// mysql driver 

	//JdbcTemplate -> query 

//database framework -> hibernate 


