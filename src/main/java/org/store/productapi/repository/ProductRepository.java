package org.store.productapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.store.productapi.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // ...
}

