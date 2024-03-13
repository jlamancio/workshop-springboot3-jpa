package br.devsuperior.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.devsuperior.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{}

