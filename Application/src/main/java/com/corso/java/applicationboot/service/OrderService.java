package com.corso.java.applicationboot.service;

import com.corso.java.applicationboot.domain.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    public List<Order> findAll();

    public Optional<Order> findById(String id);

    public void delete(String id);
}
