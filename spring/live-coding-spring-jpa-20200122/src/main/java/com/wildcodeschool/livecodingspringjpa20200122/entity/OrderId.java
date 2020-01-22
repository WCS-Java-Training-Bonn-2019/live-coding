package com.wildcodeschool.livecodingspringjpa20200122.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class OrderId implements Serializable {
	private Long bookId;
	private Long customerId;

	public OrderId() {		
	}
	
	public OrderId(Long bookId, Long customerId) {
		super();
		this.bookId = bookId;
		this.customerId = customerId;
	}
	
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
 
        if (o == null || getClass() != o.getClass())
            return false;
 
        OrderId that = (OrderId) o;
        return Objects.equals(bookId, that.bookId) &&
               Objects.equals(customerId, that.customerId);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(bookId, customerId);
    }
}
