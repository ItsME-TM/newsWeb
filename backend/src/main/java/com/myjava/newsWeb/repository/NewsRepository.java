package com.myjava.newsWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myjava.newsWeb.entity.News;

public interface NewsRepository extends JpaRepository<News, Long>{
    
}
