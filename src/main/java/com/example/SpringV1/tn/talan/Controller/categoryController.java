package com.example.SpringV1.tn.talan.Controller;
import com.example.SpringV1.tn.talan.Dto.CategoryDto;
import com.example.SpringV1.tn.talan.Entity.Category;
import com.example.SpringV1.tn.talan.Service.categoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")

public class categoryController {
    @Autowired
    private categoryService categoryService;

    @GetMapping
    public List<Category> getAllCategory(){ return this.categoryService.getAllCategory();}

    @GetMapping("{id}")
    public CategoryDto getCategoryById(@PathVariable Long id){return this.categoryService.getCategoryById(id);}

    @PostMapping
    public CategoryDto createCategory(@RequestBody CategoryDto categoryDto){ return this.categoryService.createCategory(categoryDto);}

    @PutMapping
    public CategoryDto updateCategory(@RequestBody CategoryDto categoryDto){ return this.categoryService.updateCategory(categoryDto);}

    @DeleteMapping("{id}")
    public HttpStatus deleteCategory(@PathVariable Long id){
        this.categoryService.deleteCategory(id);
        return HttpStatus.OK;
    }
}
