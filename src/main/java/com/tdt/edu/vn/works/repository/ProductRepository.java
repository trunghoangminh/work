package com.tdt.edu.vn.works.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tdt.edu.vn.works.domain.Product;

public interface ProductRepository extends MongoRepository<Product, Serializable> {

}
