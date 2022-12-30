package br.com.jeangabriel.webServiceSpring.repositories;

import br.com.jeangabriel.webServiceSpring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
