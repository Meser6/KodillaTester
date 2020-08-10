
package forFun;

public class Zadania3 {
    public static void main(String[] args) {
        Zadanie1();
        Zadanie2();
    }

    public static void Zadanie1() {
        System.out.println("Zadanie 1: ");
        Tablica[] tablica = new Tablica[5];
        tablica[0] = new Tablica('a');
        tablica[1] = new Tablica('b');
        tablica[2] = new Tablica('c');
        tablica[3] = new Tablica('d');
        tablica[4] = new Tablica('e');
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i].tablica);
        }
    }

    public static void Zadanie2() {
        System.out.println("Zadanie 2: ");
        Tablica2[] tablica2 = new Tablica2[3];
        tablica2[0] = new Tablica2(3);
        tablica2[1] = new Tablica2(4);
        tablica2[2] = new Tablica2(5);
        for (int i = (tablica2.length - 1); i <= 0; i--) {
            System.out.println(tablica2[i].tablica);
        }
    }
}
