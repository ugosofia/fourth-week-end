package com.corso.java.applicationboot.controller;


import com.corso.java.applicationboot.domain.Product;
import com.corso.java.applicationboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping(path = "/{id}")
    ResponseEntity<Product> findById(@PathVariable String id) {
        Optional<Product> prodotto = productService.findById(id);
        return new ResponseEntity<Product>((Product) productService.findById(id).get(), HttpStatus.OK);
    }

    @GetMapping()
    ResponseEntity<?> findAll() {
        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
    }

    @DeleteMapping(path="/{id}")
    ResponseEntity<Void> delete(@PathVariable String id) {
        productService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
