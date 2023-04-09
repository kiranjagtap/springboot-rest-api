package com.ri.firstspringboot.controller;

import com.ri.firstspringboot.model.dto.CategoryDto;
import com.ri.firstspringboot.model.dto.CategoryResponse;
import com.ri.firstspringboot.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping
    public CategoryResponse createCategory(@RequestBody CategoryDto categoryDto){

        return categoryService.save(categoryDto);
    }
}
