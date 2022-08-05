package com.example.demo.controllers;

import com.example.demo.Service.OrderService;
import com.example.demo.dto.OrdersDTO;
import com.example.demo.dto.ProductDTO;
import com.example.demo.entity.Orders;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping
    public List<OrdersDTO> getAllOrders(){
        return orderService.getAllOrders();
    }

    @GetMapping("{id}")
    public OrdersDTO getById(@PathVariable Integer id){
        return orderService.getById(id);
    }

    @PostMapping
    public void insertOrder(@RequestBody Orders order){
        orderService.save(order);
    }

    @PutMapping
    public void updateOrder(@RequestBody Orders order){
        orderService.save(order);
    }

    @DeleteMapping("{id}")
    public void deleteOrder(@PathVariable(value = "id") Integer orderId){
        orderService.deleteOrder(orderId);
    }

}
