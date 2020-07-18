import java.util.Random;
import java.util.Scanner;

public class dupa extends Game {
    boolean comp = isComputer();
    String xOrY = getXY();
    String[] d = getG();

    public void Game() {
        System.out.println("== Round 1 ==");
        round1();
        System.out.println("== Round 2 ==");
        round2();
        System.out.println("== Round 3 ==");
        round1();
        System.out.println("== Round 4 ==");
        round2();
        System.out.println("== Round 5 ==");
        round1();
        System.out.println("== Round 6 ==");
        round2();
        System.out.println("== Round 7 ==");
        round1();
        System.out.println("== Round 8 ==");
        round2();
        System.out.println("== Round 9 ==");
        round1();
    }


    private int random() {
        return new Random().nextInt(9);
    }

    private void round1() {
        if (xOrY == "O" && comp == true) {
            // int one = new Random().nextInt(9);
            //  for (int x = one ; d[x] != " "; x = new Random().nextInt(9)){
            //     add(x); }
           // do {
             //  p += random();
           // } while (d[p] == " ");
           // add(p);
            while (d[random()]== " ")
                add(random());
        } else {
            Scanner one = new Scanner(System.in);
            System.out.println("Choose a number of game pole where you want put a char.");
            int XXX = one.nextByte() - 1;
            add(XXX);
        }
    }

    private void round2() {
        if (comp == true) {
            int one = new Random().nextInt(9);
            add(one);
        } else {
            Scanner one = new Scanner(System.in);
            System.out.println("Choose a number of game pole where you want put a char.");
            int XXX = one.nextByte() - 1;
            add(XXX);
        }
    }
}

