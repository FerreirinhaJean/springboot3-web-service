package br.com.jeangabriel.webServiceSpring.repositories;

import br.com.jeangabriel.webServiceSpring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
