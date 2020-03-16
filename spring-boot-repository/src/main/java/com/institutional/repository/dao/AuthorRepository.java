package com.institutional.repository.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.institutional.repository.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
