package com.example.shopping.controller;

import com.example.shopping.domain.Toy;
import com.example.shopping.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/api/toy/{id}")
    public Toy getProductDetail(@PathVariable int id) {
        return productService.getProduct(id);
    }
}
