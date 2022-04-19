package com.corso.java.applicationboot.service;


import com.corso.java.applicationboot.domain.Delivery;

import com.corso.java.applicationboot.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeliveryServiceImpl implements DeliveryService{


    @Autowired
    DeliveryRepository deliveryRepository;

    public Optional<Delivery> findById(String id) {
        return deliveryRepository.findById(id);
    }

    @Override
    public void delete(String id) {
        deliveryRepository.deleteById(id);
    }

    public List<Delivery> findAll() {
        return deliveryRepository.findAll();
    }

}