package br.com.jeangabriel.webServiceSpring.repositories;

import br.com.jeangabriel.webServiceSpring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
