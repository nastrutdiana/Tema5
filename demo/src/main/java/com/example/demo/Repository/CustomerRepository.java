package com.example.demo.Repository;

import com.example.demo.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface CustomerRepository extends CrudRepository<Customer, Integer> {
     Optional<Customer> findById(Integer Customerid);
     List<Customer> findAll();
     Customer save(Customer customer);
     void deleteById(Integer Customerid);

}
