package com.allianz.spring.tutorial.service;

import com.allianz.spring.tutorial.dao.PolicyRepository;
import com.allianz.spring.tutorial.model.Policy;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by semihunaldi on 11.02.2020
 */

@Service
@RequiredArgsConstructor
@Data
public class PolicyServiceImpl implements PolicyService {

    private final PolicyRepository policyRepository;

    @Override
    public Policy findByPolicyNumber(String policyNumber) {
        return policyRepository.findByPolicyNumber(policyNumber);
    }

    @Override
    public Policy findPolicyByCustom(@Param("number") String number) {
        return policyRepository.findPolicyByCustom(number);
    }

    @Override
    @Transactional
    public Policy savePolicy(Policy policy) {
        return policyRepository.save(policy);
    }
}
