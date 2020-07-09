package forFun;

public class Zadania1 {
    public static void main(String[] args) {
        one();
        two();
        three();
        four();
        five();
        six();
        seven();
        eight();
    }

    static void one() {
        int born = 1995, currentDate = 2020;
        int age = currentDate - born;
        System.out.println("1: " + "My age is " + age + " year old.");
    }

    static void two() {
        String myName = "James";
        System.out.println("2: " + "My name is: " + myName);
    }

    static void three() {
        int a = 2, b = 6;
        int sum = a + b;
        int sub = a - b;
        double div = (double) a / b;
        System.out.println("3: " + "Sum = " + sum + " & sub = " + sub + " & div = " + div);
    }

    static void four() {
        int x = 5;
        System.out.println("4: " + (x % 2 == 0));
    }

    static void five() {
        int x = 15;
            System.out.println("5: "+ (x % 3 == 0 && x % 5 == 0));
    }

    static void six() {
        int x = 2;
        System.out.println("6: " + Math.pow(x,3));
    }

    static void seven() {
        int x = 9;
        System.out.println("7: " + Math.sqrt(x));
    }

    static void eight() {
        // trójkąt jest równoboczny jak najdłuzszy odcinek jest krótszy niż suma pozostałych

        int[] tab = new int[3];
        tab[0] = 3;
        tab[1] = 4;
        tab[2] = 6;
        if (checkEquilateral(tab)) {
            System.out.println("8: true");
        } else {
            System.out.println("8: false");
        }
    }

    private static boolean checkEquilateral(int[] tab) {
        int maxOfTwo = Math.max(tab[0], tab[1]);
        int maxOfThree = Math.max(maxOfTwo, tab[2]);
        int sum = tab[0] + tab[1] + tab[2];
        int sumOfTwo = sum - maxOfThree;
        return maxOfThree < sumOfTwo;
    }
}

