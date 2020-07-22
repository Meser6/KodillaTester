package new_version;

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
        game.board.draw();
    }

    private void askMove() {
        //TODO w zaleznosci od computeropponent
    }
}
