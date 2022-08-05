package com.example.demo.controllers;

import com.example.demo.Service.CustomerService;
import com.example.demo.dto.CustomerDTO;
import com.example.demo.entity.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;


    @PostMapping
    public void insertCustomers(@RequestBody Customer customer){
        customerService.save(customer);
    }

    @PutMapping
    public void updateCustomer(@RequestBody Customer customer){
        customerService.save(customer);
    }

    @DeleteMapping("{id}")
    public void deleteCustomer(@PathVariable(value = "id") Integer customerId){
        customerService.deleteCustomer(customerId);
    }

}
