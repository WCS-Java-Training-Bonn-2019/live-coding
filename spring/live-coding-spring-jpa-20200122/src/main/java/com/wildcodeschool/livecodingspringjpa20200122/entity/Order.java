package com.wildcodeschool.livecodingspringjpa20200122.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "customer_order")
public class Order {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;

	@EmbeddedId
	private OrderId id;

//	@Id
	@ManyToOne
	@MapsId("bookId")
	private Book book;

//	@Id
	@ManyToOne
	@MapsId("customerId")
	private Customer customer;

	private Integer amount;
	
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public OrderId getId() {
		return id;
	}

	public void setId(OrderId id) {
		this.id = id;
	}

}
