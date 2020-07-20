public class WhoWin extends Game {


    private final String[] p = getG();

    public void Game() {
        initialArena();
        int round = 1;
        while (!isXWis() && !isOWins()) {
            System.out.println("\n== X == Round " + round + " ==");
            round1();
            if (isXWis() || isOWins()) {
                CheckWins();
                break;
            }
            round++;
            if (round == 10) {
                System.out.println("    +++++++++ D R O W +++++++++");
                break;
            }
            System.out.println("\n== O == Round " + round + " ==");
            round2();
            round++;
            if (isXWis() || isOWins()) {
                CheckWins();
                break;
            }
        }
    }

    public boolean isXWis() {
        if (p[0].equals("X") && p[1].equals("X") && p[2].equals("X")) {
            return true;
        } else if (p[3].equals("X") && p[4].equals("X") && p[5].equals("X")) {
            return true;
        } else if (p[6].equals("X") && p[7].equals("X") && p[8].equals("X")) {
            return true;
        } else if (p[0].equals("X") && p[4].equals("X") && p[8].equals("X")) {
            return true;
        } else if (p[0].equals("X") && p[3].equals("X") && p[6].equals("X")) {
            return true;
        } else if (p[1].equals("X") && p[4].equals("X") && p[7].equals("X")) {
            return true;
        } else if (p[2].equals("X") && p[5].equals("X") && p[8].equals("X")) {
            return true;
        } else return p[2].equals("X") && p[4].equals("X") && p[6].equals("X");
    }

    private boolean isOWins() {
        if (p[0].equals("O") && p[1].equals("O") && p[2].equals("O")) {
            return true;
        } else if (p[3].equals("O") && p[4].equals("O") && p[5].equals("O")) {
            return true;
        } else if (p[6].equals("O") && p[7].equals("O") && p[8].equals("O")) {
            return true;
        } else if (p[0].equals("O") && p[4].equals("O") && p[8].equals("O")) {
            return true;
        } else if (p[0].equals("O") && p[3].equals("O") && p[6].equals("O")) {
            return true;
        } else if (p[1].equals("O") && p[4].equals("O") && p[7].equals("O")) {
            return true;
        } else if (p[2].equals("O") && p[5].equals("O") && p[8].equals("O")) {
            return true;
        } else return p[2].equals("O") && p[4].equals("O") && p[6].equals("O");
    }

    private void CheckWins() {
        if (isXWis()) {
            System.out.println("+++++++++ X WINS!!! +++++++++");
        } else if (isOWins())
            System.out.println("+++++++++ O WINS!!! +++++++++");
    }
}

