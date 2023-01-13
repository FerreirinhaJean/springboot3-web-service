package br.com.jeangabriel.webServiceSpring.config;


import br.com.jeangabriel.webServiceSpring.entities.Category;
import br.com.jeangabriel.webServiceSpring.entities.Order;
import br.com.jeangabriel.webServiceSpring.entities.Product;
import br.com.jeangabriel.webServiceSpring.entities.User;
import br.com.jeangabriel.webServiceSpring.entities.enums.OrderStatus;
import br.com.jeangabriel.webServiceSpring.repositories.CategoryRepository;
import br.com.jeangabriel.webServiceSpring.repositories.OrderRepository;
import br.com.jeangabriel.webServiceSpring.repositories.ProductRepository;
import br.com.jeangabriel.webServiceSpring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

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
        User u1 = new User(null, "Maria", "maria@gmail.com", "12345678", "54321");
        User u2 = new User(null, "Alex Telles", "alex@gmail.com", "5487678", "54aa1");

        Order o1 = new Order(null, Instant.parse("2022-12-28T16:15:49Z"), u1, OrderStatus.WAITING_PAYMENT);
        Order o2 = new Order(null, Instant.parse("2022-11-28T12:55:49Z"), u2, OrderStatus.DELIVERED);
        Order o3 = new Order(null, Instant.parse("2022-10-28T10:35:49Z"), u1, OrderStatus.SHIPPED);

        Category c1 = new Category(null, "Categoria 1");
        Category c2 = new Category(null, "Categoria 2");
        Category c3 = new Category(null, "Categoria 3");

        categoryRepository.saveAll(Arrays.asList(c1, c2, c3));

        Product p1 = new Product(null, "Produto 1", "Este é o produto 1", 25.95, "");
        Product p2 = new Product(null, "Produto 2", "Este é o produto 2", 16.95, "");
        Product p3 = new Product(null, "Produto 3", "Este é o produto 3", 225.05, "");

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
        productRepository.saveAll(Arrays.asList(p1, p2, p3));

        p1.getCategories().add(c2);
        p2.getCategories().add(c1);
        p2.getCategories().add(c3);
        p3.getCategories().add(c1);

        productRepository.saveAll(Arrays.asList(p1, p2, p3));
    }
}
