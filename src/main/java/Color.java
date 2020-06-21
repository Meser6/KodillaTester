import java.util.Scanner;

public class Color {
    public static String getColor() {
        Scanner getColor = new Scanner(System.in);
        while (true) {
            System.out.println("Select your color: (R-red, B -blue, G-green, Y-yellow, W-white)");
            String color = getColor.nextLine().trim().toUpperCase();
            switch (color) {
                case "R":
                    color = "Red";
                    break;
                case "B":
                    color = "Blue";
                    break;
                case "G":
                    color = "Green";
                    break;
                case "Y":
                    color = "Yellow";
                    break;
                case "W":
                    color = "White";
                    break;
                default:
                    System.out.println("Wrong letter. Try again");
            }
            System.out.println("Your color: " + color);
        }
    }

    public static void main(String[] args) {
        getColor();
    }
}
