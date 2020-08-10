package com.example.SpringV1.tn.talan.Service;
import com.example.SpringV1.tn.talan.Dto.CategoryDto;
import com.example.SpringV1.tn.talan.Entity.Category;


import java.util.List;

public interface categoryService {

    CategoryDto createCategory(CategoryDto categoryDto);

    CategoryDto updateCategory(CategoryDto categoryDto);

    CategoryDto getCategoryById(Long id);

    List<Category> getAllCategory();

    void deleteCategory(Long id);
}
