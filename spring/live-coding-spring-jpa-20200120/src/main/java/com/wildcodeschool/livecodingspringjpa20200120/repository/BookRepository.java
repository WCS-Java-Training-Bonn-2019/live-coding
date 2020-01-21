package com.wildcodeschool.livecodingspringjpa20200120.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcodeschool.livecodingspringjpa20200120.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

	Book findByTitleContaining(String title);
}
