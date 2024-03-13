package br.devsuperior.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.devsuperior.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{}

