package com.ri.firstspringboot.service;

import com.ri.firstspringboot.model.Category;
import com.ri.firstspringboot.model.dto.CategoryDto;
import com.ri.firstspringboot.model.dto.CategoryResponse;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {

    public CategoryResponse getCategoryWithBooks();
    public CategoryResponse save(CategoryDto categoryDto);
}
