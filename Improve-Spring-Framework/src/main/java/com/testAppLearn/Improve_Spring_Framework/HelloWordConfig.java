package com.testAppLearn.Improve_Spring_Framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWordConfig {

    @Bean
    public String name(){
        return "DanseLoup";
    }

    @Bean
    public int age() {
        return 25;
    }



}
