package com.allianz.spring.tutorial.controller;

import com.allianz.spring.tutorial.model.Customer;
import com.allianz.spring.tutorial.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by semihunaldi on 11.02.2020
 */

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/findByEmail")
    public Customer findByEmail(@RequestParam("email") String email) {
        return customerService.findByEmail(email);
    }

    @GetMapping("/name/{name}/surname/{surname}")
    public List<Customer> findCustomerByNameAndSurname(@PathVariable("name") String name, @PathVariable("surname") String surname) {
        return customerService.findPolicyByNameAndSurname(name, surname);
    }

    @PostMapping(path = "/saveCustomer")
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }
}
