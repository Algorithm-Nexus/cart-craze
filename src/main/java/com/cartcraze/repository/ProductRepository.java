package com.cartcraze.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cartcraze.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}
