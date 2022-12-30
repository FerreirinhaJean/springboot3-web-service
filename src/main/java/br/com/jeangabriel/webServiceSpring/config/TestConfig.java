package br.com.jeangabriel.webServiceSpring.config;


import br.com.jeangabriel.webServiceSpring.entities.Order;
import br.com.jeangabriel.webServiceSpring.entities.User;
import br.com.jeangabriel.webServiceSpring.repositories.OrderRepository;
import br.com.jeangabriel.webServiceSpring.repositories.UserRepository;
import org.aspectj.weaver.ast.Or;
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

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria", "maria@gmail.com", "12345678", "54321");
        User u2 = new User(null, "Alex Telles", "alex@gmail.com", "5487678", "54aa1");

        Order o1 = new Order(null, Instant.parse("2022-12-28T16:15:49Z"), u1);
        Order o2 = new Order(null, Instant.parse("2022-11-28T12:55:49Z"), u2);
        Order o3 = new Order(null, Instant.parse("2022-10-28T10:35:49Z"), u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

    }
}
