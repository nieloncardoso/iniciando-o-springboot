package com.aulasspring.aulasspring.services;

import com.aulasspring.aulasspring.entities.Category;
import com.aulasspring.aulasspring.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServices {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();

    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();

    }
}
