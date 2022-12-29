package br.com.jeangabriel.webServiceSpring.repositories;

import br.com.jeangabriel.webServiceSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
