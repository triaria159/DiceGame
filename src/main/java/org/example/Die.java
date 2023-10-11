package org.example;

import java.util.Random;

public class Die {
    private int lastRoll;

    public int play() {
        Random random = new Random();
        lastRoll = random.nextInt(6) + 1;
        return lastRoll;
    }

    public int getNum() {
        return lastRoll;
    }
}