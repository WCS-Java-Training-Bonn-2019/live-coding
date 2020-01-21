package com.wildcodeschool.livecodingspringjpa20200121.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcodeschool.livecodingspringjpa20200121.entity.Publisher;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long>{
	// implementation happens automagically by Spring!
}
