package com.allianz.spring.tutorial.service;

import com.allianz.spring.tutorial.model.Policy;

/**
 * Created by semihunaldi on 11.02.2020
 */
public interface PolicyService {
    Policy findByPolicyNumber(String policyNumber);

    Policy findPolicyByCustom(String number);

    Policy savePolicy(Policy policy);
}
