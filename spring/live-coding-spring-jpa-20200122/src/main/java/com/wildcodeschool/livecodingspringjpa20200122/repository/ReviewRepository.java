package com.wildcodeschool.livecodingspringjpa20200122.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcodeschool.livecodingspringjpa20200122.entity.Review;
import com.wildcodeschool.livecodingspringjpa20200122.entity.ReviewId;

@Repository
public interface ReviewRepository extends JpaRepository<Review, ReviewId> {
	// implementation happens automagically by Spring!
}
