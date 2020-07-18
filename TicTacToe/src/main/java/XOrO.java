import java.util.Scanner;

// tutaj wybierasz czy chcesz grac X czy Y. jesli wybrałes X to do playerOne jest dopisane X a do playerTwo Y, i na odwrót.

public class XOrO extends Choice {

    private final String XY = xOrY();
    //private String playerOne = playerOne();
   // private String playerTwo = playerTwo();

    private static String xOrY() {
        System.out.println("Would you like to use X or O? ");
        Scanner choose = new Scanner(System.in);
        while (true) {
            String chooseXY = choose.nextLine().trim().toUpperCase();
            switch (chooseXY) {
                case "X":
                    return "X";
                case "O":
                    return "O";
                default:
                    System.out.println("Wrong char. Please chose X or O");
            }
        }
    }

 /*   private final String playerOne() {
        if (XY == "X") {
            return "X";
        } else {
            return "O";
        }
    }


    private final String playerTwo() {
        if (XY == "X") {
            return "O";
        } else {
            return "X";
        }

    }



    public String getXY() {
        return XY;
    }

    public String getPlayerOne() {
        return playerOne;
    }

    public String getPlayerTwo() {
        return playerTwo;
    }

  */
}
