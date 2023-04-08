package com.ecommerce.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.web.dao.ProductDao;
import com.ecommerce.web.entity.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDao productdao;
	
	public Product addNewProduct(Product product) {
		return productdao.save(product);
	}
}
