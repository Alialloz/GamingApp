package com.testAppLearn.Improve_Spring_Framework;

import com.testAppLearn.Improve_Spring_Framework.game.GameRunner;
import com.testAppLearn.Improve_Spring_Framework.game.MarioGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingBasic2 {

    public static void main(String[] args) {
        // 1. Launch Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWordConfig.class);


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
    }
}
