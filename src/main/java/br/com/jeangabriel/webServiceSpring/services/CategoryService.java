package br.com.jeangabriel.webServiceSpring.services;

import br.com.jeangabriel.webServiceSpring.entities.Category;
import br.com.jeangabriel.webServiceSpring.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id) {
        return categoryRepository.findById(id).get();
    }

}
