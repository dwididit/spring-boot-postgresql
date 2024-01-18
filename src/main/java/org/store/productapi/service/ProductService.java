package org.store.productapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.store.productapi.model.Product;
import org.store.productapi.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Method to retrieve all products from the database
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Other methods for CRUD operations can be defined here
}
