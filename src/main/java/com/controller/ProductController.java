package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		productRepository.save(product);
		return product;
	}

	// api - read all products

	@GetMapping("/products")
	public List<ProductEntity> getAllProducts() {
		// select * from products
		List<ProductEntity> products = productRepository.findAll();
		return products;
	}

	// api - read single product - by id
	@GetMapping("/products/{productId}")
	public ProductEntity getProductById(@PathVariable Integer productId) {
		Optional<ProductEntity> op = productRepository.findById(productId);
		if (op.isEmpty()) {
			return null;
		} else {
			return op.get();
		}

	}

}
//rest client ->POST MAN 

//jdbc : 
// spring data jdbc
// mysql driver

// JdbcTemplate -> query

//database framework -> hibernate 
