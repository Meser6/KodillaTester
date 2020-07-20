import java.util.Random;
import java.util.Scanner;

public class Game extends Prepare {

    private final boolean comp = isComputer();
    private final String xOrY = getXY();
    private String[] d = getG();
    int i = 3;

    public void round1() {
        if (xOrY.equals("O") && comp) {
            i = 3;
            int x = new Random().nextInt(9);
            while (true) {
                if (!d[x].equals(" ")) {
                    x = new Random().nextInt(9);
                } else {
                    add(x);
                    break;
                }
            }
        } else {
            i = 3;
            System.out.println("Choose a number of game pole where you want put a char.");
            Scanner one = new Scanner(System.in);
            int X = one.nextInt() - 1;
            while (true) {
                if (X > 8 || X < 0) {
                    badAdd(X);
                    Scanner two = new Scanner(System.in);
                    X = two.nextInt() - 1;
                } else if (!d[X].equals(" ")) {
                    badAdd(X);
                    Scanner two = new Scanner(System.in);
                    X = two.nextInt() - 1;
                } else {
                    add(X);
                    break;
                }
            }
        }
    }

    public void round2() {
        if (xOrY.equals("X")){
            i = 4;
        }
        if (comp && i % 2 == 0) {
            int x = new Random().nextInt(9);
            while (true) {
                if (!d[x].equals(" ")) {
                    x = new Random().nextInt(9);
                } else {
                    add(x);
                    break;
                }
            }
        } else {
            i = 3;
            System.out.println("Choose a number of game pole where you want put a char.");
            Scanner one = new Scanner(System.in);
            int X = one.nextInt() - 1;
            while (true) {
                if (X > 8 || X < 0) {
                    badAdd(X);
                    Scanner two = new Scanner(System.in);
                    X = two.nextInt() - 1;
                } else if (!d[X].equals(" ")) {
                    badAdd(X);
                    Scanner two = new Scanner(System.in);
                    X = two.nextInt() - 1;
                } else {
                    add(X);
                    break;
                }
            }
        }
    }
}
