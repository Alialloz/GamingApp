package com.testAppLearn.Improve_Spring_Framework;

import com.testAppLearn.Improve_Spring_Framework.game.GameRunner;
import com.testAppLearn.Improve_Spring_Framework.game.MarioGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingBasic2 {

    public static void main(String[] args) {
        // 1. Launch Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWordConfig.class);
        // 2. Configure things we want spring ton manage - @Configuration

    }
}
