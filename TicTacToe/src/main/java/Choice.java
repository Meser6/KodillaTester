import java.util.Scanner;

public class Choice {
    private final String op = choice();
    private final boolean computer = computer();

    private String choice() {
        System.out.println("\n--- Hello in Tic Tac Toe!--- \n\nWould you like to play with computer or other player? " +
                "(C - computer / P - Other player)");
        Scanner hello = new Scanner(System.in);
        while (true) {
            String opponent = hello.nextLine().trim().toLowerCase();
            switch (opponent) {
                case "c":
                    return "yes";
                case "p":
                    return "no";
                default:
                    System.out.println("Wrong choice. Please choose 'C'omputer or 'P'layer");
            }
        }
    }

    private boolean computer() {
        return "yes".equals(op);
    }

    public boolean isComputer() {
        return computer;
    }
}