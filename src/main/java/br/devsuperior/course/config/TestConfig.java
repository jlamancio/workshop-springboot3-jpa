package br.devsuperior.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.devsuperior.course.entities.User;
import br.devsuperior.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;   // injecaco de dependencia

	@Override
	public void run(String... args) throws Exception {
		
		User  u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User  u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		User  u3 = new User(null, "João Pedro", "joao@gmail.com", "988888888", "111111");
		User  u4 = new User(null, "José Luis Amancio", "jose@gmail.com", "977777777", "222222");
		User  u5 = new User(null, "Flavia Boconcelo", "flavia@gmail.com", "988888888", "333333");
		User  u6 = new User(null, "Ana Paula Boconcelo", "ana@gmail.com", "977777777", "444444");
		User  u7 = new User(null, "Jose Almeida", "jalmeida@gmail.com", "988888888", "555555");
		User  u8 = new User(null, "Brenner Boconcelo", "brenner@gmail.com", "977777777", "666666");
		User  u9 = new User(null, "Bruno Boconcelo", "bruno@gmail.com", "988888888", "777777");
		User u10 = new User(null, "Ravi Yago", "ravi@gmail.com", "977777777", "888888");
		User u11 = new User(null, "GAbriela Jaccomini", "gabriela@gmail.com", "999999999", "123456");
		User u12 = new User(null, "Rainha do Abacaxi", "rainha@gmail.com", "101010101", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5, u6, u7, u8, u9, u10, u11, u12));
		
		
	}

}
