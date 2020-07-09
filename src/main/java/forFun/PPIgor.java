package forFun;

public class PPIgor {
    public static void main(String[] args) {
        int liczby[] = new int[10];
        liczby[0] = 254;
        liczby[1] = 5585;
        liczby[2] = 4517;
        liczby[3] = 785593;
        liczby[4] = 879;
        liczby[5] = 95791;
        liczby[6] = 527;
        liczby[7] = 8;
        liczby[8] = 7989;
        liczby[9] = 985;

        int war1 = (liczby[0] + liczby[1] + liczby[2] + liczby[3]);
        double war2 = war1 / liczby[4];
        int war3 = (liczby[5] + liczby[6] + liczby[7] + liczby[8] + liczby[9]);
        double war4 = Math.sqrt(war3);
        double warNotFinal = Math.abs(war2 - war4);
        int warFinal = (int) warNotFinal;
        System.out.println(warFinal);
        if (warFinal % 2 == 0) {
            System.out.println("tak");
        } else {
            System.out.println("nie");
        }
    }
}
