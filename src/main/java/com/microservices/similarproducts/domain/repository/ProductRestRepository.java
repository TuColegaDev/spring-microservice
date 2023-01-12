package com.microservices.similarproducts.domain.repository;

import com.microservices.similarproducts.SimilarProductsApplication;
import com.microservices.similarproducts.domain.model.Product;

import com.microservices.similarproducts.domain.service.rest.RestProductService;
import com.microservices.similarproducts.domain.service.rest.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProductRestRepository implements RestRepository  {

    private final SimilarProductsApplication application;
    private final RestService restProductService;

    @Value("${service.base.url}")
    private String baseURL;

    @Autowired
    public ProductRestRepository(SimilarProductsApplication application){
        this.application = application;
        this.restProductService = new RestProductService();
    }

    @Override
    public Product findById(String id) {
        String url = this.baseURL + id;

        Product product = (Product) restProductService.getObjectFrom(url, Product.class);

        return product;
    }

    @Override
    public Integer[] findSimilarIds(String id) {
        String url = this.baseURL + id + "/similarids";

        Integer[] similarIds = (Integer[]) restProductService.getObjectFrom(url, Integer[].class);

        return similarIds;
    }
}
