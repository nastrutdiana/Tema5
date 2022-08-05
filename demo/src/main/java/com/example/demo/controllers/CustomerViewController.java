package com.example.demo.controllers;

import com.example.demo.Service.CustomerService;
import com.example.demo.dto.CustomerDTO;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerViewController {
    @Autowired
    CustomerService customerService;

    @GetMapping("customers")
    public String getCustomers(Model model){
        model.addAttribute("customer",customerService.getAllCustomers());
        return "customers";
    }

    @GetMapping("customers/{id}")
    public String getById(@PathVariable Integer id, Model model){
        model.addAttribute("customer", customerService.getCustomerById(id));
        return "customers";
    }
}
