package com.institutional.repository.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.institutional.repository.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
