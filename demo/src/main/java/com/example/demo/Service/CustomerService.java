package com.example.demo.Service;

import com.example.demo.Repository.CustomerRepository;
import com.example.demo.dto.CustomerDTO;
import com.example.demo.entity.Customer;
import com.example.demo.mapper.CustomerMapper;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    CustomerMapper customerMapper;


    public List<CustomerDTO> getAllCustomers(){
        return customerRepository.findAll().stream().map(customerMapper::toCustomerDTO).collect(Collectors.toList());
    }

    public CustomerDTO getCustomerById(Integer id){
        return customerMapper.toCustomerDTO(customerRepository.findById(id).get());
    }

    public void save(Customer customer){
        customerRepository.save(customer);
    }

    public void deleteCustomer(Integer Customerid){
        customerRepository.deleteById(Customerid);
    }


}



