package com.example.demo.Service;

import com.example.demo.Repository.OrderRepository;
import com.example.demo.dto.OrdersDTO;
import com.example.demo.entity.Orders;
import com.example.demo.mapper.OrdersMapper;
import com.sun.istack.NotNull;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OrderService {

    OrdersMapper ordersMapper;
    @Autowired
    OrderRepository orderRepository;
    public List<OrdersDTO> getAllOrders(){
        return orderRepository.findAll().stream().map(ordersMapper::toOrdersDTO).collect(Collectors.toList());
    }

    public OrdersDTO getById(Integer id){
        return ordersMapper.toOrdersDTO(orderRepository.findById(id).get());
    }

    public void save(Orders order){
        orderRepository.save(order);
    }

    public void deleteOrder(Integer Orderid){
        orderRepository.deleteById(Orderid);
    }

}
