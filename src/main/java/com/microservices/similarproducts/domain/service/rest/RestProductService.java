package com.microservices.similarproducts.domain.service.rest;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

@Service
public class RestProductService implements RestService {

    private final RestTemplate restTemplate;

    public RestProductService(){
        this.restTemplate = new RestTemplate();
    }

    @Override
    public Object getObjectFrom(String url, Class objectClass) {
        try{
            Object result = restTemplate.getForObject(url, objectClass);
            return result;
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Not found", e);
        }
    }
}
