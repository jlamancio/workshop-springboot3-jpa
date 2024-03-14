package br.devsuperior.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.devsuperior.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{}

