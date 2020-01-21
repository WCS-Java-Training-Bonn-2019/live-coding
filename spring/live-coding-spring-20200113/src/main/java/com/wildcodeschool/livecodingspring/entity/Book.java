package com.wildcodeschool.livecodingspring.entity;

public class Book {

	private long id;
	
	private String isbn13;
	
	private String title;
	
	private String authors;

	private int availableStock;

	public Book(long id, String isbn13, String title, String authors, int availableStock) {
		super();
		this.id = id;
		this.isbn13 = isbn13;
		this.title = title;
		this.authors = authors;
		this.availableStock = availableStock;
	}

	public long getId() {
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
	

}
