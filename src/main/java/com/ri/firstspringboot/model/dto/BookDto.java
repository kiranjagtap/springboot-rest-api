package com.ri.firstspringboot.model.dto;

import com.ri.firstspringboot.model.Book;

public class BookDto {

    private Integer id;
    private String book;

    private Integer categoryId;

    public BookDto() {
    }

    public BookDto(Book book) {
        this.id = book.getId();
        this.book = book.getBook();
        this.categoryId = book.getCategory().getId();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}
