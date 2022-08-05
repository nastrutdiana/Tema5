package com.example.demo.mapper;

import com.example.demo.dto.OrdersDTO;
import com.example.demo.entity.Orders;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrdersMapper {
    OrdersDTO toOrdersDTO(Orders orders);
}
