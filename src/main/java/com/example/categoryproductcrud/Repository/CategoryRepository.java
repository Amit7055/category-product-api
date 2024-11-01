package com.example.categoryproductcrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.categoryproductcrud.Entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

