package com.allianz.spring.tutorial.service;

import com.allianz.spring.tutorial.dao.CustomerRepository;
import com.allianz.spring.tutorial.model.Customer;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by semihunaldi on 11.02.2020
 */

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer findByEmail(String email) {
        return customerRepository.findByEmail(email);
    }

    @Override
    public List<Customer> findPolicyByNameAndSurname(String name, String surname) {
        return customerRepository.findPolicyByNameAndSurname(name, surname);
    }

    @Override
    @Transactional
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
