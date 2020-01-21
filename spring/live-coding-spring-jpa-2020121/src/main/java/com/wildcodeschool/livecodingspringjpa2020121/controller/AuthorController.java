package com.wildcodeschool.livecodingspringjpa2020121.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.wildcodeschool.livecodingspringjpa2020121.entity.Author;
import com.wildcodeschool.livecodingspringjpa2020121.repository.AuthorRepository;

@Controller
public class AuthorController {

	private final AuthorRepository repository;

	@Autowired
	public AuthorController(AuthorRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/authors")
	public String getAll(Model model) {
		model.addAttribute("authors", repository.findAll());
		return "author/get_all";
	}

	@PostMapping("/author/upsert")
	public String insert(@ModelAttribute Author author) {
		author = repository.save(author);
		return "redirect:/authors";
	}

	@GetMapping({ "/author/new", "/author/edit/{id}" })
	public String edit(Model model, @PathVariable(required = false) Long id) {
		Author author = new Author();
		if (id != null) {
			Optional<Author> optionalAuthor = repository.findById(id);
			if (optionalAuthor.isPresent()) {
				author = optionalAuthor.get();
			} else {
				return "redirect:/";
			}
		}
		model.addAttribute("author", author);
		return "author/edit";
	}

	@GetMapping("/author/delete/{id}")
	public String delete(@PathVariable("id") long id) {
		repository.deleteById(id);
		return "redirect:/authors";
	}

}
