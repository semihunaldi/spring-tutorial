package com.allianz.spring.tutorial.controller;

import com.allianz.spring.tutorial.model.Policy;
import com.allianz.spring.tutorial.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by semihunaldi on 11.02.2020
 */

@RestController
@RequestMapping("/policy")
public class PolicyController {

    @Autowired
    private PolicyService policyService;

    @GetMapping(path = "/findByPolicyNumber")
    public Policy findByPolicyNumber(@RequestParam("policyNumber") String policyNumber) {
        return policyService.findByPolicyNumber(policyNumber);
    }

    @GetMapping(path = "/{number}")
    public Policy findPolicyByCustom(@PathVariable("number") String number) {
        return policyService.findPolicyByCustom(number);
    }

    @PostMapping(path = "/savePolicy")
    public Policy savePolicy(@RequestBody Policy policy) {
        return policyService.savePolicy(policy);
    }
}
