package com.evggenn.ecommerce.product;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByIdInOrderById(List<Long> productIds);
}
