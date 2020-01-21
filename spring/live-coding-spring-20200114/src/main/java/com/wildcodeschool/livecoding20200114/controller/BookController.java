package com.wildcodeschool.livecoding20200114.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wildcodeschool.livecoding20200114.repository.BookRepository;

@Controller
public class BookController {

	private final BookRepository repository;

	@Autowired
	public BookController(BookRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/books")
	public String getBooks(Model model) {
		model.addAttribute("books", repository.getAll());
		return "book_get_all";
	}

	@GetMapping("/books/search")
	public String searchBooks(Model model, @RequestParam(name = "title", required = true) String title) {
		model.addAttribute("books", repository.findByTitleContaining(title));
		return "book_get_all";
	}

}
