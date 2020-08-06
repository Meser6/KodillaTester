package new_version;

import java.awt.*;
import java.util.Scanner;

public class Game2 {
    public Game2() {
        this.board = new Board();
    }

    private Board board;
    private Side currentTurn;
    private boolean computerOpponent; // TODO

    public Side checkWin() {
        //TODO
        return Side.NONE;
    }

    public void changeTurn() {
        if (currentTurn.equals(Side.X)) {
            currentTurn = Side.O;
        } else {
            currentTurn = Side.X;
        }
    }

    public void start() {
        this.currentTurn = Side.O;
        while (true) {
            askMove();
            board.draw();
            if (checkWin() != Side.NONE) {
                break;
            } else {
                changeTurn();
            }

        }
    }


    public static void main(String[] args) {
        var game = new Game2();
        game.start();
    }

    private void askMove() {
        while (true) {
            System.out.println("\n" + currentTurn.toString() + " Podaj pole");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (validate(x, y)) {
                board.put(x,y,currentTurn);
                return;
            }

            //TODO w zaleznosci od computeropponent
        }
    }

    private boolean validate(int x, int y) {
        return true; //TODO
    }
}
