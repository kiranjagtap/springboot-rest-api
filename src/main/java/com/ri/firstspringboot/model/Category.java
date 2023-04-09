package com.ri.firstspringboot.model;

import com.ri.firstspringboot.model.dto.CategoryDto;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "category")
    private String categoryName;
    @OneToMany
    List<Book> books;

    public Category() {
    }

    public Category(CategoryDto categoryDto) {

        this.id = categoryDto.getId();
        this.categoryName = categoryDto.getCategory();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}

