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
public class ProductService {
	private final CategoryRepository categoryRepository;
	private final ProductRepository productRepository;
	private final CategoryProductRepository categoryProductRepository;

	public ProductService(CategoryRepository categoryRepository, ProductRepository productRepository,
			CategoryProductRepository categoryProductRepository) {
		this.categoryRepository = categoryRepository;
		this.productRepository = productRepository;
		this.categoryProductRepository = categoryProductRepository;
	}
	
	public List<Product> allProducts(){
		return productRepository.findAll();
	}
	
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}
	
	public Product addCategory(Product product,Category category) {
		product.addCategory(category);
		return productRepository.save(product);
	}
	
	public Product findProduct(Long id) {
		Optional <Product> optionalProduct = productRepository.findById(id);
		if(optionalProduct.isPresent()) {
			return optionalProduct.get();
		}
		else {
			return null;
		}
	}
 
	public List<Product> otherProducts(Long id){
		Optional <Category> optionalCategory = categoryRepository.findById(id);
		if(optionalCategory.isPresent()) {
			return productRepository.findByCategoriesNotContains(optionalCategory.get());
		}
		return null;
	}
}
