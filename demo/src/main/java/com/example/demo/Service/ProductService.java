package com.example.demo.Service;

import com.example.demo.Repository.ProductRepository;
import com.example.demo.dto.ProductDTO;
import com.example.demo.entity.Product;
import com.example.demo.mapper.ProductMapper;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class ProductService {
    ProductMapper productMapper;
    @Autowired
    ProductRepository productRepository;


    public List<ProductDTO> getAllProduct(){
        return productRepository.findAll().stream().map(productMapper::toProductDTO).collect(Collectors.toList());
    }

    public ProductDTO getById(Integer id){
        return productMapper.toProductDTO(productRepository.findById(id).get());
    }

    public void save(Product product){
        productRepository.save(product);
    }

    public void deleteProduct(Integer productId){
        productRepository.deleteById(productId);
    }



}
