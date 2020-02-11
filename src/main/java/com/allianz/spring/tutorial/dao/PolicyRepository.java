package com.allianz.spring.tutorial.dao;

import com.allianz.spring.tutorial.model.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by semihunaldi on 11.02.2020
 */

public interface PolicyRepository extends JpaRepository<Policy, Long> {

    Policy findByPolicyNumber(String policyNumber);

    @Query("select p from Policy p where p.policyNumber = :number")
    Policy findPolicyByCustom(@Param("number") String number);
}
