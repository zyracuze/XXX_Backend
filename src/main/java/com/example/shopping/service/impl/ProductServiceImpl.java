package com.example.shopping.service.impl;

import com.example.shopping.domain.Toy;
import com.example.shopping.repository.ToyRepository;
import com.example.shopping.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private ToyRepository toyRepository;

    public ProductServiceImpl(ToyRepository toyRepository) {
        this.toyRepository = toyRepository;
    }

    @Override
    public Toy getProduct(int id) {
        return toyRepository.findById(id).orElse(null);
    }
}
