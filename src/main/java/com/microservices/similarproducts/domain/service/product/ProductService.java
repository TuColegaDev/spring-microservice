package com.microservices.similarproducts.domain.service.product;
import com.microservices.similarproducts.domain.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getSimilarProducts(String productId);
}
