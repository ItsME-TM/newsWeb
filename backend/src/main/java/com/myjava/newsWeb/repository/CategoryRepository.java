package com.myjava.newsWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myjava.newsWeb.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
