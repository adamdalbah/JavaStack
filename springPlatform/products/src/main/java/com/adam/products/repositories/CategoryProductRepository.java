package com.adam.products.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adam.products.models.Category;
import com.adam.products.models.CategoryProduct;
import com.adam.products.models.Product;

@Repository
public interface CategoryProductRepository extends CrudRepository<CategoryProduct , Long> {

	
}
