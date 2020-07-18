import java.util.Scanner;

// tutaj wybierasz czy chcesz grac z czlowiekiem czy z kompem. boolean computer zwraca true jesli wybrales kompa

public class Choice {
    private String op = choice();
    private final boolean computer = computer();

    private String choice() {
        System.out.println("--- Hello in Tic Tac Toe!--- \nWould you like to play with computer or other player? " +
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
        switch (op) {
            case "yes":
                return true;
            case "no":
                return false;
            default:
                return false;
        }
    }

    public boolean isComputer() {
        return computer;
    }
}
