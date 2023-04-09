package com.ri.firstspringboot.model;

import com.ri.firstspringboot.model.dto.BookDto;

import javax.persistence.*;

@Entity
@Table(name="book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "book")
    private String book;

    @ManyToOne
    private Category category;

    public Book() {

    }

    public Book(BookDto bookDto) {
        this.id = bookDto.getId();
        this.book = bookDto.getBook();

    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
