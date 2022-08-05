package com.example.demo.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Orders {
    @Id
    @GeneratedValue
    private Integer id;

    private String status;
    private String comments;
}
