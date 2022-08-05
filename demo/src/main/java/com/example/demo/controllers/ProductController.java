package com.example.demo.controllers;

import com.example.demo.Service.ProductService;
import com.example.demo.dto.ProductDTO;
import com.example.demo.entity.Product;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public List<ProductDTO> getAllProducts(){
        return productService.getAllProduct();
    }

    @GetMapping("{id}")
    public ProductDTO getById(@PathVariable Integer id){
        return productService.getById(id);
    }

    @PostMapping
    public void insertProduct(@RequestBody Product product){
        productService.save(product);
    }

    @PutMapping
    public void updateProduct(@PathVariable Product product){
        productService.save(product);
    }

    @DeleteMapping("{id}")
    public void deleteProduct(@PathVariable(value = "id") Integer productId){
        productService.deleteProduct(productId);
    }
}
