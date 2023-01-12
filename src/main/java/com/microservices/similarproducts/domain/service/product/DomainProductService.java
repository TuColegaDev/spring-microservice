package com.microservices.similarproducts.domain.service.product;

import com.microservices.similarproducts.domain.model.Product;
import com.microservices.similarproducts.domain.repository.RestRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DomainProductService implements ProductService {
    private final RestRepository restRepository;

    public DomainProductService(RestRepository restRepository){
        this.restRepository = restRepository;
    }

    public List<Product> getSimilarProducts(String productId){
        List<Product> products = new ArrayList<>();
        Integer[] similarIds = restRepository.findSimilarIds(productId);

        for (Integer id : similarIds) {
            products.add(restRepository.findById(id.toString()));
        }

        return products;
    }
}
