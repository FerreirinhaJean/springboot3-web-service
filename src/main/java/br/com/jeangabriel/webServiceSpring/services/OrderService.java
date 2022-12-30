package br.com.jeangabriel.webServiceSpring.services;


import br.com.jeangabriel.webServiceSpring.entities.Order;
import br.com.jeangabriel.webServiceSpring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> objOrder = orderRepository.findById(id);
        return objOrder.get();
    }

}
