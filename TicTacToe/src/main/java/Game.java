public class Game extends XOrO {

    boolean comp = isComputer();
    String one = "X";    //getPlayerOne();
    String two = "O";    //getPlayerTwo();
    boolean x = itsXtour();

    public static String[] g = {" ", " ", " ", " ", " ", " ", " ", " ", " ",};

    public void initialArena() {
        System.out.println("It's a game arena: ");
        System.out.println("  1  |  2  |  3  \n-----|-----|-----\n  4  |  5  |  6  \n-----|-----|-----\n  7  |  8  |" +
                "  9   ");
        System.out.println("If you use X, you started. Choose a number of game pole where you want put a char.");
    }

    public void areaFlash() {
        System.out.println("  " + g[0] + "  |  " + g[1] + "  |  " + g[2] + "  \n-----|-----|-----\n  " + g[3] + "  |  "
                + g[4] + "  |" + "  " + g[5] + "  \n-----|-----|-----\n  " + g[6] + "  |  " + g[7] + "  |  " + g[8]
                + "   ");
    }

    public int y() {
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


    public boolean itsXtour() { // jeśli jest true to jest kolej X a jeśli false to Y
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
        if (yy % 2 != 0) {
            return false;
        } else {
            return true;
        }
    }

    public void add(int value) {
        if (value >= 0 && value <= 8) {
            if (itsXtour() == true) {
                g[value] = one;
            } else {
                g[value] = two;
            }
        } else {
            System.out.println("Wrong number area.");
        }
    }
}
