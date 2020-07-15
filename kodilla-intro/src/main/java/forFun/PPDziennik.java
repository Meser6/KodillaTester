package forFun;

public class PPDziennik {
    public static void main(String[] args) {
        PPMark mark = new PPMark("Kuba", "Kaczmarczyk", 5, 5, 4, 6);
        double average = (mark.math + mark.pe + mark.geography + mark.biology) / 4;
        //System.out.println(mark.name + " " + mark.surname + "have marks: "+ mark.math + " "+ mark.pe+ " " + mark.geography + " " + mark.biology + ". And he have average: " + average  );
        PPMark mark1 = new PPMark("Igor", "Kaczmarczyk", 4, 6, 4, 4);
        double average2 = (mark1.math + mark1.pe + mark1.geography + mark1.biology) / 4;
        System.out.println(mark1.name + " " + mark1.surname + "have marks: " + mark1.math + " " + mark1.pe + " " + mark1.geography + " " + mark1.biology + ". And he have average: " + average2);
    }
}
