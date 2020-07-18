package forFun;

public class PPZabawy1 {
    public static void main(String[] args) {
        zagadkaTabela();
    }
    static void mark() {
        int math = 5;
        int biology = 5;
        int geography = 2;
        int polish = 2;
        int mein = 5;
        double sum = math + biology + geography + polish;
        double sredniaDwa = sum / 4;
        boolean srednia = sredniaDwa > 4;
        if (srednia && mein >= 4) {
            System.out.println("Należy się");
        } else if (srednia && mein < 4) {
            System.out.println("Dobra średnia ale przez zachowanie się nie należy");
        } else if (!srednia && mein < 4) {
            System.out.println("Do dupy średnia i zachowanie. \"Rowy kopać!\"");
        } else {
            System.out.println("Dobre zachowanie ale zła średnia. baranie!");
        }
    }
    static void zagadka() {
        int jeden = 5;
        int dwa = 4;
        double trzy = (jeden + dwa) / 2.0;
        System.out.print(trzy);

    }
    static void zagadkaTabela(){
        int[] tab = {2,5,6};
        System.out.println(tab[2]);
    }
}
