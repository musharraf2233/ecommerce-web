package com.ecommerce.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.web.entity.Product;
import com.ecommerce.web.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping("/addNewProduct")
	public void addNewProduct(@RequestBody Product product) {
		productService.addNewProduct(product);
	}
}
