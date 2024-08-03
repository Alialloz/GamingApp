package com.testAppLearn.Improve_Spring_Framework;

import com.testAppLearn.Improve_Spring_Framework.game.GameRunner;
import com.testAppLearn.Improve_Spring_Framework.game.MarioGame;

public class AppGamingBasic {

    public static void main(String[] args) {

        // Com
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
        // EndCom

    }
}
