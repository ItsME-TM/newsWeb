package com.myjava.newsWeb.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.myjava.newsWeb.entity.Category;
import com.myjava.newsWeb.repository.CategoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepo;

    public List<Category> getAllCategories(){
        return categoryRepo.findAll();
    }

    public Category createCategory(Category c){
        return categoryRepo.save(c);
    }
}
