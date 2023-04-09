package com.ri.firstspringboot.model.dto;

import com.ri.firstspringboot.model.Book;
import com.ri.firstspringboot.model.Category;

import java.util.List;

public class CategoryResponse {

    List<Category> categoryList;

    Integer id;

    String Category;
    String response;

    Boolean success;

    public CategoryResponse() {
    }

    public CategoryResponse(List<Category> categoryList, String response) {
        this.categoryList = categoryList;
        this.response = response;
    }

    public CategoryResponse(String response) {
        this.response = response;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }
}
