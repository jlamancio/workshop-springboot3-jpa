package br.devsuperior.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.devsuperior.course.entities.Product;
import br.devsuperior.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findBYId(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
	
	
}


