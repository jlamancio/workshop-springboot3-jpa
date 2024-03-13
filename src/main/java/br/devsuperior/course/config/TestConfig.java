package br.devsuperior.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.devsuperior.course.entities.Category;
import br.devsuperior.course.entities.Order;
import br.devsuperior.course.entities.Product;
import br.devsuperior.course.entities.User;
import br.devsuperior.course.entities.enums.OrderStatus;
import br.devsuperior.course.repositories.CategoryRepository;
import br.devsuperior.course.repositories.OrderRepository;
import br.devsuperior.course.repositories.ProductRepository;
import br.devsuperior.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	// Injeção de dependências

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
				
		p1.getCategories().add(cat2);
		p2.getCategories().add(cat1);
		p2.getCategories().add(cat3);
		p3.getCategories().add(cat3);
		p4.getCategories().add(cat3);
		p5.getCategories().add(cat2);

		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		User u3 = new User(null, "João Pedro", "joao@gmail.com", "988888888", "111111");
		User u4 = new User(null, "José Luis Amancio", "jose@gmail.com", "977777777", "222222");
		User u5 = new User(null, "Flavia Boconcelo", "flavia@gmail.com", "988888888", "333333");
		User u6 = new User(null, "Ana Paula Boconcelo", "ana@gmail.com", "977777777", "444444");
		User u7 = new User(null, "Jose Almeida", "jalmeida@gmail.com", "988888888", "555555");
		User u8 = new User(null, "Brenner Boconcelo", "brenner@gmail.com", "977777777", "666666");
		User u9 = new User(null, "Bruno Boconcelo", "bruno@gmail.com", "988888888", "777777");
		User u10 = new User(null, "Ravi Yago", "ravi@gmail.com", "977777777", "888888");
		User u11 = new User(null, "GAbriela Jaccomini", "gabriela@gmail.com", "999999999", "123456");
		User u12 = new User(null, "Rainha do Abacaxi", "rainha@gmail.com", "101010101", "123456");

		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.CANCELED, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.DELIVERED, u3);
		Order o4 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u4);
		Order o5 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.PAID, u5);
		Order o6 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o7 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.SHIPPED, u7);
		Order o8 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.PAID, u8);
		Order o9 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.PAID, u9);
		Order o10 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u11);
		Order o11 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.PAID, u11);
		Order o12 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.PAID, u12);
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5, u6, u7, u8, u9, u10, u11, u12));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12));

	}

}
