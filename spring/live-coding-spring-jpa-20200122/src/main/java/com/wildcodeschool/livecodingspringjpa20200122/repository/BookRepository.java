package com.wildcodeschool.livecodingspringjpa20200122.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wildcodeschool.livecodingspringjpa20200122.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	// implementation happens automagically by Spring!

	List<Book> findByTitle(String title);

	List<Book> findByTitleOrAuthors(String title, String authors);

	List<Book> getByTitleContainingOrAuthorsContaining(String title, String authors);

	List<Book> getByTitleContainingOrAuthorsLastNameContainingOrderByAvailableStockDesc(String title, String authors);
	
	List<Book> getTop2ByTitleContainingOrAuthorsContainingOrderByAvailableStockDesc(String title, String authors);

	List<Book> findByTitleContaining(String title);
	
	
	@Query("SELECT b FROM Book b WHERE LENGTH(isbn13) <= :length")
	List<Book> findByNoMagicThing(int length);
	
	@Query(value = "SELECT * FROM book WHERE LENGTH(isbn13) <= :length", nativeQuery=true)
	List<Book> findByIsbnLengthNative(int length);
}
