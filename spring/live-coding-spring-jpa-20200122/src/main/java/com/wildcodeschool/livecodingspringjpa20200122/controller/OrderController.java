package com.wildcodeschool.livecodingspringjpa20200122.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.wildcodeschool.livecodingspringjpa20200122.entity.Order;
import com.wildcodeschool.livecodingspringjpa20200122.repository.BookRepository;
import com.wildcodeschool.livecodingspringjpa20200122.repository.CustomerRepository;
import com.wildcodeschool.livecodingspringjpa20200122.repository.OrderRepository;

@Controller
public class OrderController {

	private final OrderRepository repository;

	private final BookRepository bookRepository;

	private final CustomerRepository customerRepository;

	@Autowired
	public OrderController(OrderRepository repository, BookRepository bookRepository,
			CustomerRepository customerRepository) {
		this.repository = repository;
		this.bookRepository = bookRepository;
		this.customerRepository = customerRepository;
	}

	@GetMapping("/orders")
	public String getAll(Model model) {
		model.addAttribute("orders", repository.findAll());
		return "order/get_all";
	}

	@PostMapping("/order/upsert")
	public String insert(@ModelAttribute Order order) {
		order = repository.save(order);
		return "redirect:/orders";
	}

	@GetMapping({ "/order/new", "/order/edit/{id}" })
	public String edit(Model model, @PathVariable(required = false) Long id) {
		model.addAttribute("allBooks", bookRepository.findAll());
		model.addAttribute("allCustomers", customerRepository.findAll());
		Order order = new Order();
		if (id != null) {
			Optional<Order> optionalOrder = repository.findById(id);
			if (optionalOrder.isPresent()) {
				order = optionalOrder.get();
			} else {
				return "redirect:/";
			}
		}
		model.addAttribute("order", order);
		return "order/edit";
	}

	@GetMapping("/order/delete/{id}")
	public String delete(@PathVariable("id") long id) {
		repository.deleteById(id);
		return "redirect:/orders";
	}

}
