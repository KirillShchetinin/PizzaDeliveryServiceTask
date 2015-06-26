/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.shad.yandex.pizzadelivery.service;

import ua.shad.yandex.pizzadelivery.domain.Pizza;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.shad.yandex.pizzadelivery.repository.PizzaRepository;

@Service("pizzaService")
public class SimplePizzaService implements PizzaService {

    PizzaRepository repository;
    
    @Autowired
    public SimplePizzaService(PizzaRepository rep) {
        this.repository = rep;
    }

    @Override
    public List<Pizza> getAllPizzas() {
        return repository.getAllPizzas();
    }

}
