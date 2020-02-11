package com.allianz.spring.tutorial.service;

import com.allianz.spring.tutorial.model.Customer;

import java.util.List;

/**
 * Created by semihunaldi on 11.02.2020
 */
public interface CustomerService {

    Customer findByEmail(String email);

    List<Customer> findPolicyByNameAndSurname(String name, String surname);

    Customer saveCustomer(Customer customer);
}
