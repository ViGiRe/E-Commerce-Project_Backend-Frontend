package com.app.Ecommerce_Major_Project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Ecommerce_Major_Project.Model.Category;
import com.app.Ecommerce_Major_Project.Repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public void addCategory(Category category) {
		categoryRepository.save(category);
	}
	
	public List<Category> addAttribute() {
		
		return categoryRepository.findAll();
	}
}
