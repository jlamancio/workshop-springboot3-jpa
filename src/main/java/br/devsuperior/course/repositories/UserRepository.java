package br.devsuperior.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.devsuperior.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
