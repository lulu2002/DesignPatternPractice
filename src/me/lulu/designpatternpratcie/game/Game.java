package me.lulu.designpatternpratcie.game;

import java.util.Queue;

public class Game {

    private Queue<GameState> states;

    public void init() {
        states.add(new PreparingState());
    }

}
