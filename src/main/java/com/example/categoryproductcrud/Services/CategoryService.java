package com.example.categoryproductcrud.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.categoryproductcrud.Entity.Category;
import com.example.categoryproductcrud.Repository.CategoryRepository;
import com.example.categoryproductcrud.exception.IdNotFoundException;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public Page<Category> getAllCategories(Pageable pageable) {
		return categoryRepository.findAll(pageable);
	}

	public Category getCategoryById(Long id) {
		return categoryRepository.findById(id).orElseThrow(() -> new IdNotFoundException("Category not found with id: " + id));
	}

	public Category saveCategory(Category category) {
		return categoryRepository.save(category);
	}

	public Category updateCategory(Long id, Category updatedCategory) {
		Category category = getCategoryById(id);
		category.setName(updatedCategory.getName());
		return categoryRepository.save(category);
	}

	public void deleteCategory(Long id) {
		categoryRepository.deleteById(id);
	}
}