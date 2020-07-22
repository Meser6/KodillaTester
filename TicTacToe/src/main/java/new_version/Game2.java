package new_version;

public class Game2 {
    public Game2() {
        this.board = new Bartd();
    }

    private Bartd board;
    private Side currentTurn;
    private boolean computerOpponent; // TODO

    public boolean checkWin() {
        //TODO
        return false;
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
            if (checkWin()) {
                break;
            } else {
                changeTurn();
            }

        }
    }


    public static void main(String[] args) {
        var game = new Game2();
        game.start();
        game.board.draw();
    }

    private void askMove() {
        //TODO w zaleznosci od computeropponent
    }
}
