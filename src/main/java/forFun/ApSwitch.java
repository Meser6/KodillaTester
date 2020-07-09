package forFun;

import java.util.Scanner;

public class ApSwitch {
    int number1 = ApEnterNumber.getNumber1();
    int number2 = ApEnterNumber.getNumber2();
    int number3 = ApEnterNumber.getNumber3();
    String operation = operation();
    int result = result();

    public String operation() {
        Scanner operation = new Scanner(System.in);
        while (true) {
            System.out.println("What you want to do with your number? (A - add, S - subtract, M - multiply)");
            String op = operation.nextLine().trim().toUpperCase();
            switch (op) {
                case "A":
                   result("ADD");
                case "S":
                    result("ADD");
                case "M":
                    result("ADD");
                case "E":
                    System.exit(0);

                default:
                    System.out.println("Wrong calculation. Try again.");
            }
        }
    }

    public int result(String operation) {
        switch (operation) {
            case "ADD":
                return number1 + number2 + number3;
            case "SUB":
                return number1 - number2 - number3;
            case "MUL":
                return number1 * number2 * number3;
            default:
                return 0;
        }
    }


    public void finale(int result()) {
        if (result() % 2 == 0) {
            System.out.println("Your color is RED");
        } else if (result % 3 == 0) {
            System.out.println("Your color is YELLOW");
        } else {
            System.out.println("Your color is GREEN");
        }
    }

}