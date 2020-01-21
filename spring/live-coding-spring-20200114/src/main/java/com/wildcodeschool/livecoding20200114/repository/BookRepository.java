package com.wildcodeschool.livecoding20200114.repository;

import java.util.List;

import com.wildcodeschool.livecodingspring.entity.Book;

public interface BookRepository {

	public List<Book> getAll();

	public List<Book> findByTitleContaining(String titleSubString);

}
