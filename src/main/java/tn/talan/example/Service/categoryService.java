package tn.talan.example.Service;
import tn.talan.example.Dto.CategoryDto;
import tn.talan.example.Entity.Category;


import java.util.List;

public interface categoryService {

    CategoryDto createCategory(CategoryDto categoryDto);

    CategoryDto updateCategory(CategoryDto categoryDto);

    CategoryDto getCategoryById(Long id);

    List<Category> getAllCategory();

    void deleteCategory(Long id);
}
