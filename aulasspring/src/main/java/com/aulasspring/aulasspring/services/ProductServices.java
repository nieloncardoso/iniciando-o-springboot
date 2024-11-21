package com.aulasspring.aulasspring.services;

import com.aulasspring.aulasspring.entities.Product;
import com.aulasspring.aulasspring.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServices {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();

    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();

    }
}
