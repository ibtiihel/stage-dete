package com.example.SpringV1.tn.talan.ServiceImpl;

import com.example.SpringV1.tn.talan.Dto.CategoryDto;
import com.example.SpringV1.tn.talan.Dto.PostDto;
import com.example.SpringV1.tn.talan.Entity.Category;
import com.example.SpringV1.tn.talan.Entity.Post;
import com.example.SpringV1.tn.talan.Helper.ModelMapperConverter;
import com.example.SpringV1.tn.talan.Repository.categoryRepository;
import com.example.SpringV1.tn.talan.Service.categoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class categoryServiceImpl implements categoryService {

    @Autowired
    private categoryRepository categoryRepository;

    @Autowired
    private ModelMapperConverter modelMapperConverter;

    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {

         Category category = modelMapperConverter.convert(categoryDto,Category.class);
         this.categoryRepository.save(category);
         return categoryDto;
    }

    @Override
    public CategoryDto updateCategory(CategoryDto categoryDto) {

        Category category = modelMapperConverter.convert(categoryDto,Category.class);
        this.categoryRepository.save(category);
        return categoryDto;
    }

    @Override
    public List<Category> getAllCategory() {

        return this.categoryRepository.findAll();
    }

    @Override
    public CategoryDto getCategoryById(Long id) {

        Category category = this.categoryRepository.findById(id).get();
        return modelMapperConverter.convert(category, CategoryDto.class);
    }

    @Override
    public void deleteCategory(Long id) {
        this.categoryRepository.deleteById(id);
    }

}
