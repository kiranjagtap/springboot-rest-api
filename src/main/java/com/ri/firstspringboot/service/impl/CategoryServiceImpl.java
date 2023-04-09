package com.ri.firstspringboot.service.impl;

import com.ri.firstspringboot.model.Book;
import com.ri.firstspringboot.model.Category;
import com.ri.firstspringboot.model.dto.CategoryDto;
import com.ri.firstspringboot.model.dto.CategoryResponse;
import com.ri.firstspringboot.repository.CategoryRepository;
import com.ri.firstspringboot.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {


    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public CategoryResponse getCategoryWithBooks() {

        Book history1 = new Book();
        history1.setBook("History 1");
        Book history2 = new Book();
        history2.setBook("History 2");

        Book math1 = new Book();
        math1.setBook("Math 1");
        Book math2 = new Book();
        math2.setBook("Math 2");

        Category history = new Category();
        history.setCategoryName("History");
        List<Book> historyBookList = new ArrayList<>();
        historyBookList.add(history1);
        historyBookList.add(history2);
        history.setBooks(historyBookList);

        Category math = new Category();
        math.setCategoryName("Math");
        List<Book> mathBookList = new ArrayList<>();
        mathBookList.add(math1);
        mathBookList.add(math2);
        math.setBooks(mathBookList);


        List<Category> categoryList = new ArrayList<>();
        categoryList.add(history);
        categoryList.add(math);

        CategoryResponse categoryResponse = null;
        if (null != categoryList) {
            categoryResponse = new CategoryResponse(categoryList, "success");

        } else {
            categoryResponse = new CategoryResponse("failure");
        }


        return categoryResponse;
    }

    @Override
    public CategoryResponse save(CategoryDto categoryDto) {
        CategoryResponse categoryResponse = null;
        Category category = new Category(categoryDto);
        Category persistedCategory = categoryRepository.save(category);

        if (null != persistedCategory) {
            categoryResponse = new CategoryResponse();
            categoryResponse.setSuccess(true);
            categoryResponse.setId(persistedCategory.getId());
            categoryResponse.setCategory(persistedCategory.getCategoryName());

            return categoryResponse;
        } else {
            categoryResponse = new CategoryResponse();
            categoryResponse.setSuccess(false);
            return categoryResponse;
        }
    }
}
