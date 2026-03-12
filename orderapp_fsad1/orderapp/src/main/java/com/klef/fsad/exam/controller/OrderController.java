package com.klef.fsad.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.klef.fsad.exam.model.Order;
import com.klef.fsad.exam.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping
    public Order addOrder(@RequestBody Order o) {
        return service.addOrder(o);
    }

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable int id) {
        return service.getOrder(id);
    }
}
