package com.wildcodeschool.livecodingspringjpa20200122.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class ReviewId implements Serializable {

	private static final long serialVersionUID = -6486818684849492209L;

	private Long bookId;
	private Long customerId;

	public ReviewId() {
	}

	public ReviewId(Long bookId, Long customerId) {
		super();
		this.bookId = bookId;
		this.customerId = customerId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (o == null || getClass() != o.getClass())
			return false;

		ReviewId that = (ReviewId) o;
		return Objects.equals(bookId, that.bookId) && Objects.equals(customerId, that.customerId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookId, customerId);
	}
}
