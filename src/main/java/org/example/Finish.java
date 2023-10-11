package org.example;

public class Finish implements Dice {

    @Override
    public int die() {
        return 0;
    }

    @Override
    public void re() {
        System.out.println("Cannot restart a finished game.");
    }

    @Override
    public void fin() {
        System.out.println("Game finished.");
    }
}