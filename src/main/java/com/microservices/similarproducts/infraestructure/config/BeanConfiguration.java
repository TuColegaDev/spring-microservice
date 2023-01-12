package com.microservices.similarproducts.infraestructure.config;

import com.microservices.similarproducts.domain.repository.RestRepository;
import com.microservices.similarproducts.domain.service.product.DomainProductService;
import com.microservices.similarproducts.domain.service.product.ProductService;
import com.microservices.similarproducts.domain.service.rest.RestProductService;
import com.microservices.similarproducts.domain.service.rest.RestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    ProductService productService(RestRepository restRepository){
        return new DomainProductService(restRepository);
    }
    @Bean
    RestService restService(){
        return new RestProductService();
    }
}
