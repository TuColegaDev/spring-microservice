package com.microservices.similarproducts.domain.repository;

import com.microservices.similarproducts.domain.model.Product;

import java.util.Optional;

public interface RestRepository {

    Product findById(String id);
    Integer[] findSimilarIds(String id);
}
