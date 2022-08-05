package com.example.demo.Repository;

import com.example.demo.entity.Orders;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends CrudRepository<Orders, Integer> {
    List<Orders> findAll();
    Optional<Orders> findById(Integer OrderId);
    Orders save(Orders orders);
    void deleteById(Integer OrderId);

}
