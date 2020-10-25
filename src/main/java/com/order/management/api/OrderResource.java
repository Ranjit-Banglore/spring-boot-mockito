package com.order.management.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderResource {
    @GetMapping
    public String getOrders() {
        return "Hello Worlds!";
    }
}
