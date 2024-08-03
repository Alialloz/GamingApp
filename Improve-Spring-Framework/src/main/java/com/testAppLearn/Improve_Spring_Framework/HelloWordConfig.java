package com.testAppLearn.Improve_Spring_Framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// Reduit verbosité, avec automatisation des getter setter ...
record Person (String name, int age){};

record Address (String street, String city){};

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

    @Bean
    public Person person() {
        return new Person("Mehdi", 26);
    }

    @Bean
    public Address address() {
        return new Address("123 Main St", "Limeil");
    }

}
