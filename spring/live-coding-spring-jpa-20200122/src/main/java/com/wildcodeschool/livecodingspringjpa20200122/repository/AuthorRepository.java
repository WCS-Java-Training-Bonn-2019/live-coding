package com.wildcodeschool.livecodingspringjpa20200122.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcodeschool.livecodingspringjpa20200122.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>{
	// implementation happens automagically by Spring!
}
