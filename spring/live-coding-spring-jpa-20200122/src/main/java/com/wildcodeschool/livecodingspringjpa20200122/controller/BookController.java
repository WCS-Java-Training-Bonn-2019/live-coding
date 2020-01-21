package com.wildcodeschool.livecodingspringjpa20200122.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wildcodeschool.livecodingspringjpa20200122.entity.Book;
import com.wildcodeschool.livecodingspringjpa20200122.entity.Publisher;
import com.wildcodeschool.livecodingspringjpa20200122.repository.AuthorRepository;
import com.wildcodeschool.livecodingspringjpa20200122.repository.BookRepository;
import com.wildcodeschool.livecodingspringjpa20200122.repository.PublisherRepository;

@Controller
public class BookController {

	private final BookRepository repository;
	private final PublisherRepository publisherRepository;
	private final AuthorRepository authorRepository;

	@Autowired
	public BookController(BookRepository repository, PublisherRepository publisherRepository,
			AuthorRepository authorRepository) {
		this.repository = repository;
		this.publisherRepository = publisherRepository;
		this.authorRepository = authorRepository;
	}

	@GetMapping("/books")
	public String getAll(Model model) {
		model.addAttribute("books", repository.findAll());
		return "book/get_all";
	}

	@GetMapping("/books/search")
	public String search(Model model, @RequestParam String searchString) {
		model.addAttribute("books",
				repository.getByTitleContainingOrAuthorsLastNameContainingOrderByAvailableStockDesc(searchString, searchString));
		return "book/get_all";
	}

	@PostMapping("/book/upsert")
	public String insert(@ModelAttribute Book book) {
		book = repository.save(book);
		return "redirect:/books";
	}

	@GetMapping({ "/book/new", "/book/edit/{id}" })
	public String edit(Model model, @PathVariable(required = false) Long id) {
		model.addAttribute("allPublishers", publisherRepository.findAll());
		model.addAttribute("allAuthors", authorRepository.findAll());
		if (id == null) {
			model.addAttribute("book", new Book());
			return "book/edit";
		}
		Optional<Book> optionalBook = repository.findById(id);
		if (optionalBook.isPresent()) {
			model.addAttribute("book", optionalBook.get());
		} else {
			return "redirect:/";
		}
		return "book/edit";
	}

	@GetMapping("/book/delete/{id}")
	public String delete(@PathVariable("id") long id) {
		repository.deleteById(id);
		return "redirect:/books";
	}

}
