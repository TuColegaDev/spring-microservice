package com.microservices.similarproducts.application;

import com.microservices.similarproducts.domain.model.Product;
import com.microservices.similarproducts.domain.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/{productId}/similar")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Product> getSimilarProducts(@PathVariable("productId") String productId){
        List<Product> products = productService.getSimilarProducts(productId);
        return products;
    }

}
