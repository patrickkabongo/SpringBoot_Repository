package com.institutional.repository.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.institutional.repository.entity.Document;

public interface DocumentRepository extends JpaRepository<Document, Long> {

}
