package com.myjava.newsWeb.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.myjava.newsWeb.entity.NewsCategory;

public interface NewsCategoryRepository extends JpaRepository<NewsCategory, Long> {
    List<NewsCategory> findByCategoryId(Long categoryId);
}
