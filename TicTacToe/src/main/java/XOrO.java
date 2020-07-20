import java.util.Scanner;

public class XOrO extends Choice {

    private final boolean comp = isComputer();

    private final String XY = xOrY();

    private String xOrY() {
        if (comp) {
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
        } else {
            return "X";
        }

    }

    public String getXY() {
        return XY;
    }
}