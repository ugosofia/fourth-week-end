package com.corso.java.applicationboot.controller;

import com.corso.java.applicationboot.domain.Delivery;
import com.corso.java.applicationboot.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    DeliveryService deliveryService;

    @GetMapping("/")
    ResponseEntity<List<Delivery>> findAll() {
        return new ResponseEntity<>(deliveryService.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    ResponseEntity<Delivery> findById(@PathVariable String id) {
        Optional<Delivery> consegna = deliveryService.findById(id);
        return new ResponseEntity<Delivery>((Delivery) deliveryService.findById(id).get(), HttpStatus.OK);
    }



}
