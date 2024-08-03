package com.testAppLearn.Improve_Spring_Framework.helloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class AppGamingBasic2 {

    public static void main(String[] args) {
        // 1. Launch Spring Context

        try(var context = new AnnotationConfigApplicationContext(HelloWordConfig.class)){

            // 2. Configure things we want spring ton manage - @Configuration
            // HelloWordConfig @Configuration
            // name @Bean


            // 3. Retrieving Beans managed by Spring
            System.out.println(context.getBean("name") );

            System.out.println(context.getBean("age"));

            System.out.println(context.getBean("person"));


            //Deux façons alternatives d'utiliser getBean
            System.out.println(context.getBean("address2"));
            //System.out.println(context.getBean(Address.class));

            System.out.println(context.getBean("person2MethodCall"));

            System.out.println(context.getBean("person3Parameters"));


            //Method refence | Fonctionnal programming
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }


    }
}
