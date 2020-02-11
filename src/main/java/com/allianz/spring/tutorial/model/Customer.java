package com.allianz.spring.tutorial.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Created by semihunaldi on 11.02.2020
 */

@Data
@Entity
@Table(name = "T_CUSTOMER", uniqueConstraints = {@UniqueConstraint(name = "emailUnique", columnNames = "email")})
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    private String email;
}
