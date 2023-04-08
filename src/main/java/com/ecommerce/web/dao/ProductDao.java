package com.ecommerce.web.dao;

import org.springframework.stereotype.Repository;

import com.ecommerce.web.entity.Product;

import org.springframework.data.repository.CrudRepository;
@Repository
public interface ProductDao extends CrudRepository<Product,Integer>{

	
}
