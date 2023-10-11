package org.example;

public class Regame implements Dice{
    private Player player1;
    private Player player2;
    private Die die;

    public Regame(Player player1, Player player2, Die die) {
        this.player1 = player1;
        this.player2 = player2;
        this.die = die;
    }

    @Override
    public int die() {
        return 0;
    }

    @Override
    public void re() {
        player1.setScore(0);
        player2.setScore(0);
        System.out.println("Game restarted.");
    }

    @Override
    public void fin() {
        System.out.println("Game finished.");
    }
}