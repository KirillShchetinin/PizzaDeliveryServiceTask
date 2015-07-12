/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.shad.yandex.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Кирилл
 */

@RestController
public class PizzaRestController {
    @RequestMapping(method = RequestMethod.GET, value = "hello")
    public String hello(){
        return "Hello from RESTcontroller";
    }
}