package com.corso.java.applicationboot.controller;


import com.corso.java.applicationboot.domain.Order;
import com.corso.java.applicationboot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping(path="/{id}")
    ResponseEntity<Order> findById(@PathVariable String id) {
        Optional<Order> ordine = orderService.findById(id);
        return new ResponseEntity<Order>((Order) orderService.findById(id).get(), HttpStatus.OK);
    }

    @GetMapping()
    ResponseEntity<?> findAll() {
        return new ResponseEntity<>(orderService.findAll(), HttpStatus.OK);
    }


    /**
    @DeleteMapping(path="/{id}")
    ResponseEntity<Void> deleteOne(@PathVariable String id) {
        orderService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    */
}
