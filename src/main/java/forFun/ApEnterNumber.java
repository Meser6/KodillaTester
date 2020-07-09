package forFun;

import java.util.Scanner;



public class ApEnterNumber {
    public static int getNumber1() {
        Scanner number1 = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your first number: ");
            int numberOne = number1.nextInt();
            if (numberOne < 10 && numberOne >= 0) {
                return numberOne;
            } else {
                System.out.println("Your number is wrong. Please enter right number (0-9)");
            }
        }
    }

    public static int getNumber2() {
        Scanner number2 = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your second number: ");
            int numberTwo = number2.nextInt();
            if (numberTwo < 10 && numberTwo >= 0) {
                return numberTwo;
            } else {
                System.out.println("Your number is wrong. Please enter right number (0-9)");
            }
        }
    }

    public static int getNumber3() {
        Scanner number3 = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your third number: ");
            int numberThree = number3.nextInt();
            if (numberThree < 10 && numberThree >= 0) {
                return numberThree;
            } else {
                System.out.println("Your number is wrong. Please enter right number (0-9)");
            }
        }
    }
}
