package com.wildcodeschool.livecodingspringjpa20200120.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wildcodeschool.livecodingspringjpa20200120.entity.Book;
import com.wildcodeschool.livecodingspringjpa20200120.repository.BookRepository;

@Controller
public class BookController {

	private final BookRepository repository;

	@Autowired
	public BookController(BookRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/books")
	public String getAll(Model model) {
		model.addAttribute("books", repository.findAll());
		return "book_get_all";
	}

	@GetMapping("/books/search")
	public String searchByTitle(Model model, @RequestParam String title ) {
		model.addAttribute("books", repository.findByTitleContaining(title));
		return "book_get_all";
	}

	@PostMapping( { "/book/insert", "/book/update", "/book/upsert" })
	public String insert(@ModelAttribute Book book) {
		book = repository.save(book);
		return "redirect:/books";
	}

	@GetMapping("/book/edit/{id}")
	public String edit(Model model, @PathVariable("id") long id) {
		Optional<Book> optionalBook = repository.findById(id);
		if (optionalBook.isPresent()) {
			model.addAttribute("book", optionalBook.get());	
		} else {
			return "redirect:/";
		}
		return "book_edit";
	}
	
	@GetMapping("/book/delete/{id}")
	public String delete(@PathVariable("id") long id) {
		repository.deleteById(id);
		return "redirect:/books";
	}
	
}
