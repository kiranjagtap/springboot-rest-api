package com.ri.firstspringboot.controller;


import com.ri.firstspringboot.model.dto.BookDto;
import com.ri.firstspringboot.model.dto.BookResponse;
import com.ri.firstspringboot.model.dto.CategoryResponse;
import com.ri.firstspringboot.service.BookService;
import com.ri.firstspringboot.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {


    @Autowired
    CategoryService categoryService;

    @Autowired
    BookService bookService;

    @GetMapping(value = "/books", produces = "application/json")
    public CategoryResponse getCategoriesAndBooks() {

        CategoryResponse categoryResponse = categoryService.getCategoryWithBooks();

        return categoryResponse;
    }

    @PostMapping
    public BookResponse createBookEntry(@RequestBody BookDto bookDto){

        return bookService.save(bookDto);
    }
}
