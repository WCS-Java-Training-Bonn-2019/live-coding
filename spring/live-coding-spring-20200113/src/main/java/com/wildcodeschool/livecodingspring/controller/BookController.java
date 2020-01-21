package com.wildcodeschool.livecodingspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wildcodeschool.livecodingspring.repository.BookRepository;

@Controller
public class BookController {

	private BookRepository repository = new BookRepository();
	
	@GetMapping("/books")
	public String getBooks(Model model) {
		model.addAttribute("books", repository.getAll() );
		return "book_get_all";
	}
	
	@GetMapping("/books/search")
	public String searchBooks(Model model, @RequestParam(name = "title", required = true) String title) {
		model.addAttribute("books", repository.findByTitleContaining(title) );
		return "book_get_all";
	}
	
}
