package com.adam.products.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.adam.products.models.Category;
import com.adam.products.models.Product;
import com.adam.products.services.CategoryService;
import com.adam.products.services.ProductService;

@Controller
public class ShopController {
	private final CategoryService categoryService;
	private final ProductService productService;
	public ShopController(CategoryService categoryService, ProductService productService) {
		this.categoryService = categoryService;
		this.productService = productService;
	}
	
	@RequestMapping("/products/new")
	public String newProduct(@ModelAttribute("product") Product product) {
		return "NewProduct.jsp";
	}
	
	@RequestMapping(value="/addProduct", method=RequestMethod.POST)
	public String addProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if (result.hasErrors()) {
			return "NewProduct.jsp";
		}
		productService.createProduct(product);
		return "redirect:/categories/new";
	}
	
	@RequestMapping("/categories/new")
	public String newProduct(@ModelAttribute("category") Category category) {
		return "NewCategory.jsp";
	}
	
	@RequestMapping(value="/addCategory", method=RequestMethod.POST)
	public String addCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if (result.hasErrors()) {
			return "NewCategory.jsp";
		}
		categoryService.createCategory(category);
		return "redirect:/showDetails";
	}
	
	@RequestMapping("/showDetails")
	public String details(Model model) {
		model.addAttribute("products", productService.allProducts());
		model.addAttribute("categories", categoryService.allCategories());
		return "Details.jsp";
	}
	@RequestMapping("/products/{id}")
	public String newProduct(@PathVariable("id") Long id, Model model, HttpSession session) {
		session.setAttribute("product", productService.findProduct(id));
		List<Category> categories = categoryService.otherCategories(id);
		model.addAttribute("categories", categories);
		model.addAttribute("presentCategories", productService.findProduct(id).getCategories());
		return "ProductPage.jsp";
	}
	
	@RequestMapping("/categories/{id}")
	public String newCategory(@PathVariable("id") Long id, Model model, HttpSession session) {
		session.setAttribute("category", categoryService.findCategory(id));
		List<Product> products= productService.otherProducts(id);
		model.addAttribute("products", products);
		model.addAttribute("presentProducts", categoryService.findCategory(id).getProducts());
		return "CategoryPage.jsp";
	}
	
	@RequestMapping(value= "/plusProduct", method = RequestMethod.POST)
	public String addedProduct(@RequestParam(value="product") Long id, HttpSession session) {
		Product product = productService.findProduct(id);
		Category category = (Category)session.getAttribute("category");
		categoryService.addProduct(category, product);
		return "redirect:/showDetails";
		
	}
	
	@RequestMapping(value= "/plusCategory", method = RequestMethod.POST)
	public String addedCategory(@RequestParam(value="category") Long id, HttpSession session) {
		Category category = categoryService.findCategory(id);
		Product product = (Product)session.getAttribute("product");
		productService.addCategory(product, category);
		return "redirect:/showDetails";
		
	}
	
	
	
}
