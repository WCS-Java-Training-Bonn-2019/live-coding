package com.wildcodeschool.livecodingspringjpa20200120.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column (nullable = false, name = "isbn13", insertable = true, updatable = true, unique = true)
	private String isbn13;
	private String title;
	private String authors;
	private int availableStock;

	public Long getId() {
		return id;
	}

	public String getIsbn13() {
		return isbn13;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthors() {
		return authors;
	}

	public int getAvailableStock() {
		return availableStock;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setIsbn13(String isbn13) {
		this.isbn13 = isbn13;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public void setAvailableStock(int availableStock) {
		this.availableStock = availableStock;
	}		

}
