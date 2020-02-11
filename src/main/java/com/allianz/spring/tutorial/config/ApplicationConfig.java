package com.allianz.spring.tutorial.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by semihunaldi on 11.02.2020
 */

@Configuration
@ComponentScan("com.allianz.spring.tutorial")
@EntityScan("com.allianz.spring.tutorial.model")
public class ApplicationConfig {

}
