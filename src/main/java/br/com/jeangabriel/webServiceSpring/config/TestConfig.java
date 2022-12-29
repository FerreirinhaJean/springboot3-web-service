package br.com.jeangabriel.webServiceSpring.config;


import br.com.jeangabriel.webServiceSpring.entities.User;
import br.com.jeangabriel.webServiceSpring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria", "maria@gmail.com", "12345678", "54321");
        User u2 = new User(null, "Alex Telles", "alex@gmail.com", "5487678", "54aa1");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
