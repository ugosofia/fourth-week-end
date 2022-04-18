package com.corso.java.applicationboot.service;

import com.corso.java.applicationboot.domain.Delivery;

import java.util.List;
import java.util.Optional;

public interface DeliveryService {
    public List<Delivery> findAll();

    public Optional<Delivery> findById(String id);

}
