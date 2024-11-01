package com.example.categoryproductcrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.categoryproductcrud.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
