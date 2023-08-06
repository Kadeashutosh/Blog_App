package com.codewithashu.blog.services;

import java.util.List;

import com.codewithashu.blog.payloads.CategoryDto;

public interface CategoryService {

	//create 
	CategoryDto createCategory(CategoryDto categorydto);
	
	
	
	//update
	 CategoryDto updateCategory(CategoryDto categorydto, Integer categoryId);
	
	
	//delete 
	
	 void deleteCategory(Integer categoryId);
	
	
	//get
	 
	 CategoryDto getCategory(Integer categoryId);
	
	//getAll
	
	List<CategoryDto> getCategories();
}
