package com.ri.firstspringboot.service;

import com.ri.firstspringboot.model.dto.BookDto;
import com.ri.firstspringboot.model.dto.BookResponse;

public interface BookService {

    public BookResponse save(BookDto bookDto);
}
