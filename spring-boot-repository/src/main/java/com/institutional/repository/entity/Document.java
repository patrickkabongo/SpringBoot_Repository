package com.institutional.repository.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="document")
@Data
public class Document {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="abstract")
	private String resume;
	
	@Column(name="pdfurl")
	private String pdfUrl;
	
	@Column(name="year")
	private String year;
	
	@ManyToOne
    @JoinColumn(name="category_id", nullable=false)
    private Category category;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(
			name="document_author",
			joinColumns=@JoinColumn(name="document_id", nullable = false),
			inverseJoinColumns=@JoinColumn(name="author_id", nullable = false)
			)
	private Set<Author> authors = new HashSet<>();
}
















