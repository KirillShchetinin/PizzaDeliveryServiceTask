/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.shad.yandex.pizzadelivery.repository;

import ua.shad.yandex.pizzadelivery.domain.Order;
import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository("orderRepo")
public class TestOrderRepositoryImpl implements OrderRepository {

    public List<Order> list;

    public TestOrderRepositoryImpl() {
        this.list = new LinkedList<>();
    }

    public TestOrderRepositoryImpl(List<Order> lo) {
        this.list = lo;
    }

    @Override
    public void addOrder(Order order) {
        this.list.add(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return this.list;
    }
}
