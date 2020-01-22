package com.wildcodeschool.livecodingspringjpa20200122.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.wildcodeschool.livecodingspringjpa20200122.entity.Review;
import com.wildcodeschool.livecodingspringjpa20200122.entity.ReviewId;
import com.wildcodeschool.livecodingspringjpa20200122.repository.BookRepository;
import com.wildcodeschool.livecodingspringjpa20200122.repository.CustomerRepository;
import com.wildcodeschool.livecodingspringjpa20200122.repository.ReviewRepository;

@Controller
public class ReviewController {

	private final ReviewRepository repository;

	private final BookRepository bookRepository;

	private final CustomerRepository customerRepository;

	@Autowired
	public ReviewController(ReviewRepository repository, BookRepository bookRepository,
			CustomerRepository customerRepository) {
		this.repository = repository;
		this.bookRepository = bookRepository;
		this.customerRepository = customerRepository;
	}

	@GetMapping("/reviews")
	public String getAll(Model model) {
		model.addAttribute("reviews", repository.findAll());
		return "review/get_all";
	}

	@PostMapping("/review/upsert")
	public String insert(@ModelAttribute Review review) {
		review.setId(new ReviewId(review.getBook().getId(), review.getCustomer().getId()));
		review = repository.save(review);
		return "redirect:/reviews";
	}

	@GetMapping({ "/review/new", "/review/edit/{bookId}/{customerId}" })
	public String edit(Model model, @PathVariable(required = false) Long bookId, @PathVariable(required = false) Long customerId) {
		model.addAttribute("allBooks", bookRepository.findAll());
		model.addAttribute("allCustomers", customerRepository.findAll());
		Review review = new Review();
		if (bookId != null && customerId != null) {
			Optional<Review> optionalReview = repository.findById(new ReviewId(bookId, customerId));
			if (optionalReview.isPresent()) {
				review = optionalReview.get();
			} else {
				return "redirect:/";
			}
		}
		model.addAttribute("review", review);
		return "review/edit";
	}

	@GetMapping("/review/delete/{bookId}/{customerId}")
	public String delete(@PathVariable(required = false) Long bookId, @PathVariable(required = false) Long customerId) {
		repository.deleteById(new ReviewId(bookId, customerId));
		return "redirect:/reviews";
	}

}
