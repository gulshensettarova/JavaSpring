package com.company.spring_technology.model.dao.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name="category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "category_name")
    private String name;
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    List<Task> tasks = new ArrayList<>();
}
