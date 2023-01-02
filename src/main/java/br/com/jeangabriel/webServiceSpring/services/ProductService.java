package br.com.jeangabriel.webServiceSpring.services;

import br.com.jeangabriel.webServiceSpring.entities.Product;
import br.com.jeangabriel.webServiceSpring.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        return productRepository.findById(id).get();
    }

}
