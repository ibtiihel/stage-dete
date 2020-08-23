package tn.talan.example.ServiceImpl;

import tn.talan.example.Dto.CategoryDto;
import tn.talan.example.Entity.Category;
import tn.talan.example.Helper.ModelMapperConverter;
import tn.talan.example.Repository.categoryRepository;
import tn.talan.example.Service.categoryService;
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
