package com.example.demo.Repository;

import com.example.demo.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product,Integer> {
    List<Product> findAll();
    Optional<Product> findById(Integer ProductId);
    Product save(Product product);
    void deleteById(Integer ProductId);
}
