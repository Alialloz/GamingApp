package com.testAppLearn.Improve_Spring_Framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// Reduit verbosité, avec automatisation des getter setter ...
record Person (String name, int age, Address address){};

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
        return new Person("Mehdi", 26, new Address("Main Street", "Boissy"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(),address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }

    @Bean (name = "address2")
    public Address address() {
        return new Address("123 Main St", "Limeil");
    }

    @Bean (name = "address3")
    public Address address3() {
        return new Address("Clocher", "Valenton");
    }

}
