package com.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bean.ProductBean;

@RestController
public class ProductController {

	// add product
	@PostMapping("/products")
	public ProductBean addProduct(@RequestBody ProductBean product) {
		System.out.println(product.getProductName());
		System.out.println(product.getCategory());
		return product;
	}
}
//rest client ->POST MAN 
