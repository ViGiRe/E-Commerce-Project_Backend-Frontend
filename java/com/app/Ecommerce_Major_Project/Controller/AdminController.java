package com.app.Ecommerce_Major_Project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.Ecommerce_Major_Project.Model.Category;
import com.app.Ecommerce_Major_Project.Service.CategoryService;

@Controller
public class AdminController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/admin")
	public String adminHome() {
		return "AdminHome";
	}
	
	@RequestMapping("/admin/categories")
	public String getCategory() {
		return "categories";
	}
	
	@PostMapping("/admin/categories/add")
	public String postCategoryAdd(@ModelAttribute("category") Category category) {
		categoryService.addCategory(category);
		return "redirect :/categoryAdd";
		
	}
	
	@GetMapping("/admin/categories/add")
	public String getCategoryAdd(Model model) {
		model.addAttribute("category", new Category());
		return "categoryAdd";
		
	}
}
