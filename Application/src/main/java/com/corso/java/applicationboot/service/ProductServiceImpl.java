package com.corso.java.applicationboot.service;

import com.corso.java.applicationboot.domain.Product;
import com.corso.java.applicationboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepository productRepository;

    public Optional<Product> findById(String id) {
        return productRepository.findById(id);
    }

    @Override
    public void delete(String id) {
        productRepository.deleteById(id);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }
}