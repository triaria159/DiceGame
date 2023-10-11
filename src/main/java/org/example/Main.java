package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        Die die = new Die();
        Dice game = new Regame(player1, player2, die); // 초기 게임은 시작 상태로 설정

        while (true) {
            System.out.println("메뉴를 선택하세요:");
            System.out.println("1. 게임하기");
            System.out.println("2. 다시하기");
            System.out.println("3. 종료하기");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int result = game.die();
                    // 여기에서 게임 결과 처리를 추가할 수 있습니다.
                    break;
                case 2:
                    game.re();
                    break;
                case 3:
                    game.fin();
                    return;
                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택하세요.");
            }
        }
    }
}