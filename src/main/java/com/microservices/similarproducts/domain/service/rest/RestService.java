package com.microservices.similarproducts.domain.service.rest;

public interface RestService {
    Object getObjectFrom(String url, Class objectClass);
}
