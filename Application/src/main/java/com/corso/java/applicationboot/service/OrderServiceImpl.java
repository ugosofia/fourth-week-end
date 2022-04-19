package com.corso.java.applicationboot.service;


import com.corso.java.applicationboot.domain.Order;
import com.corso.java.applicationboot.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired

    OrderRepository orderRepository;

    public Optional<Order> findById(String id) {
        return orderRepository.findById(id);
    }

    @Override
    public void delete(String id) {
        orderRepository.deleteById(id);
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }
}
