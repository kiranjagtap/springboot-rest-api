package com.ri.firstspringboot.service.impl;

import com.ri.firstspringboot.model.Book;
import com.ri.firstspringboot.model.Category;
import com.ri.firstspringboot.model.dto.BookDto;
import com.ri.firstspringboot.model.dto.BookResponse;
import com.ri.firstspringboot.repository.BookRepository;
import com.ri.firstspringboot.repository.CategoryRepository;
import com.ri.firstspringboot.service.BookService;
import com.ri.firstspringboot.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookeServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public BookResponse save(BookDto bookDto) {
        BookResponse bookResponse = null;
        Book book = new Book(bookDto);
        Category category = categoryRepository.findById(bookDto.getCategoryId()).get();
        book.setCategory(category);
        Book persistedBook = bookRepository.save(book);

        if (null != persistedBook) {
            bookResponse = new BookResponse();
            bookResponse.setSuccess(true);
            bookResponse.setId(persistedBook.getId());
            bookResponse.setBookDto(bookDto);


            return bookResponse;
        } else {
            bookResponse = new BookResponse();
            bookResponse.setSuccess(false);
            return bookResponse;
        }
    }
}
