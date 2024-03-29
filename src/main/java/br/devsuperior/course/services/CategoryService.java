package br.devsuperior.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.devsuperior.course.entities.Category;
import br.devsuperior.course.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findBYId(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
	
	
}


