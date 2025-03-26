package com.example.demospring.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.GenerationType.IDENTITY;

/**
 * @author Aventador
 * @create 2025-03-23-22:51
 */
@Entity
@Table(name = "user")
@Setter
@Getter
public class Student {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "email")
    private String email;


}
