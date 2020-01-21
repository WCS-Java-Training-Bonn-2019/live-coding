package com.wildcodeschool.livecodingspringjpa20200121.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.wildcodeschool.livecodingspringjpa20200121.entity.Book;
import com.wildcodeschool.livecodingspringjpa20200121.entity.Publisher;
import com.wildcodeschool.livecodingspringjpa20200121.repository.BookRepository;
import com.wildcodeschool.livecodingspringjpa20200121.repository.PublisherRepository;

@Controller
public class PublisherController {

	private final PublisherRepository repository;
	
	private final BookRepository bookRepository;

	@Autowired
	public PublisherController(PublisherRepository repository, BookRepository bookRepository) {
		this.repository = repository;
		this.bookRepository = bookRepository;
	}

	@GetMapping("/publishers")
	public String getAll(Model model) {
		model.addAttribute("publishers", repository.findAll());
		return "publisher/get_all";
	}

	@PostMapping("/publisher/upsert")
	public String insert(@ModelAttribute Publisher publisher) {
		publisher = repository.save(publisher);
		return "redirect:/publishers";
	}

	@GetMapping({ "/publisher/new", "/publisher/edit/{id}" })
	public String edit(Model model, @PathVariable(required = false) Long id) {
		Publisher publisher = new Publisher();
		if (id != null) {
			Optional<Publisher> optionalPublisher = repository.findById(id);
			if (optionalPublisher.isPresent()) {
				publisher = optionalPublisher.get();
			} else {
				return "redirect:/";
			}
		}
		model.addAttribute("publisher", publisher);
		return "publisher/edit";
	}

	@GetMapping("/publisher/delete/{id}")
	public String delete(@PathVariable("id") long id) {
		Publisher publisher = repository.getOne(id);
		for (Book book : publisher.getBooks()) {
			book.setPublisher(null);
			bookRepository.save(book);
		}
		repository.deleteById(id);
		return "redirect:/publishers";
	}

}
