/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.shad.yandex.pizzadelivery.domain;

public class Customer {
    private final String name;
    private String phone;
    
    public Customer(String name) {
        this.name = name;
    }
    
    public Customer(String name, String phone) {
        this(name);
        this.phone = phone;
    }
    
    String getName() {
        return name;
    }
    
    String getPhone() {
        return phone;
    }
    
    void setPhone(String phone) {
        this.phone = phone;
    }
}
