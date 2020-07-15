package forFun;

public class Zadania2 {
    public static void main(String[] args) {
        Zadanie1();
        Zadanie2();
        Zadanie3do9();
    }

    public static void Zadanie1() {
        System.out.println("\nZadanie 1:");
        Human human1 = new Human("Jakub", 25, 69, 1.92, true);
        Human human2 = new Human("Gosia", 18, 40, 1.56, false);
        System.out.print(human1.name + " have: " + human1.age + " age, " + human1.weight + " kg weight, " + human1.height
                + " m height, and");
        human1.isMale(human1.isMale);
        System.out.print(human2.name + " have: " + human2.age + " age, " + human2.weight + " kg weight, " + human2.height
                + " m height, and");
        human2.isMale(human2.isMale);
    }

    public static void Zadanie2() {
        System.out.println("\nZadanie 2:");
        Rectangle rectangle = new Rectangle(10, 50);
        System.out.println("Area: " + rectangle.area());
        System.out.println("Circuit: " + rectangle.circuit());
        System.out.println("Diagonal: " + rectangle.diagonal());
    }

    public static void Zadanie3do9() {
        System.out.println("\nZadanie 3:");
        MyNumber number = new MyNumber(543);
        System.out.println("Is odd? " + number.isOdd());
        System.out.println("Is even? " + number.isEven());
        System.out.println(number.sqrt());
        System.out.println(number.pow(3));
        System.out.println(number.add(167));
        System.out.println(number.subtract(1616));

    }
}

