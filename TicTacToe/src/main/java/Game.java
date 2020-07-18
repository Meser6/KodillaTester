public class Game extends XOrO {

    final String one = "X";    //getPlayerOne();
    final String two = "O";    //getPlayerTwo();

    public static final String[] g = {" ", " ", " ", " ", " ", " ", " ", " ", " ",};

    public void initialArena() {
        System.out.println("It's a game arena: ");
        System.out.println("  1  |  2  |  3  \n-----|-----|-----\n  4  |  5  |  6  \n-----|-----|-----\n  7  |  8  |" +
                "  9   ");
        System.out.println("If you use X, you started.");
    }

    public void areaFlash() {
        System.out.println("  " + g[0] + "  |  " + g[1] + "  |  " + g[2] + "  \n-----|-----|-----\n  " + g[3] + "  |  "
                + g[4] + "  |" + "  " + g[5] + "  \n-----|-----|-----\n  " + g[6] + "  |  " + g[7] + "  |  " + g[8]
                + "   ");
    }

    /*public int y() {
        int yy = 2;
        for (int i = 0; i < 9; i++) {
            switch (g[i]) {
                case " ":
                    yy += 0;
                    break;
                case "X":
                    yy += 3;
                    break;
                case "O":
                    yy += 1;
                    break;
            }
        }
        return yy;
    }

     */

    public static String[] getG() {
        return g;
    }

    public boolean itsXRound() { // jeśli jest true to jest kolej X a jeśli false to Y
        int yy = 2;
        for (int i = 0; i < 9; i++) {
            switch (g[i]) {
                case " ":
                    yy += 0;
                    break;
                case "X":
                    yy += 3;
                    break;
                case "O":
                    yy += 1;
                    break;
            }
        }
        return yy % 2 == 0;
    }

    public void add(int value) {
        if (value > 8 || value < 0) {
            System.out.println("Wrong number area.");
        } else if (g[value] != " " && value <= 8 && value >= 0) {
            System.out.println("This area is isn't empty");
        } else if (g[value] == " " && value <= 8 && value >= 0) {
            if (itsXRound()) {
                g[value] = one;
                areaFlash();
            } else if (!itsXRound()) {
                g[value] = two;
                areaFlash();
            }
        }
    }
}
