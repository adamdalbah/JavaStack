package com.adam.products.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adam.products.models.Category;
import com.adam.products.models.Product;
import com.adam.products.repositories.CategoryProductRepository;
import com.adam.products.repositories.CategoryRepository;
import com.adam.products.repositories.ProductRepository;

@Service
public class CategoryService {
	private final CategoryRepository categoryRepository;
	private final ProductRepository productRepository;
	private final CategoryProductRepository categoryProductRepository;

	public CategoryService(CategoryRepository categoryRepository, ProductRepository productRepository,
			CategoryProductRepository categoryProductRepository) {
		this.categoryRepository = categoryRepository;
		this.productRepository = productRepository;
		this.categoryProductRepository = categoryProductRepository;
	}
	
	public List<Category> allCategories(){
		return categoryRepository.findAll();
	}
	
	public Category createCategory(Category category) {
		return categoryRepository.save(category);
	}
	
	public Category addProduct(Category category,Product product) {
		category.addProduct(product);
		return categoryRepository.save(category);
	}
	public Category findCategory(Long id) {
		Optional <Category> optionalCategory = categoryRepository.findById(id);
		if(optionalCategory.isPresent()) {
			return optionalCategory.get();
		}
		else {
			return null;
		}
	}
	
	public List<Category> otherCategories(Long id){
		Optional <Product> optionalProduct = productRepository.findById(id);
		if(optionalProduct.isPresent()) {
			return categoryRepository.findByProductsNotContains(optionalProduct.get());
		}
		return null;
	}

}
