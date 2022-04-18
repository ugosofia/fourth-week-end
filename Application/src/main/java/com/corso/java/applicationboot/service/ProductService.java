package com.corso.java.applicationboot.service;

import com.corso.java.applicationboot.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public List<Product> findAll();

    public Optional<Product> findById(String id);
}
