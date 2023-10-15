package com.seyfsalis.springcoredemo.config;

import com.seyfsalis.springcoredemo.common.Coach;
import com.seyfsalis.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach(){
        return  new SwimCoach();
    }
}
