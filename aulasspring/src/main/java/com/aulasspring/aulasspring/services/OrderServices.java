package com.aulasspring.aulasspring.services;

import com.aulasspring.aulasspring.entities.Order;
import com.aulasspring.aulasspring.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServices {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();

    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();

    }
}
