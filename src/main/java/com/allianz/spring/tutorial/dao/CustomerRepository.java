package com.allianz.spring.tutorial.dao;

import com.allianz.spring.tutorial.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by semihunaldi on 11.02.2020
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByEmail(String email);

    @Query("select c from Customer c where c.name = :name and c.surname = :surname")
    List<Customer> findPolicyByNameAndSurname(@Param("name") String name, @Param("surname") String surname);
}
