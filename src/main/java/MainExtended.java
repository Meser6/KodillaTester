public class MainExtended {
    public static void main(String [] args) {
        String mountain = "Rysy";
        int hight = 2499;
        String unitHight = " m n.p.m";
        double entryTime = 5.50;
        char unitHour = 'h';
        boolean goodForBeginners = false;

        System.out.println(mountain);
        System.out.println(hight+unitHight);
        System.out.println(entryTime+" "+unitHour);
        //gdy nie dałem spacji między nimi to 'h' czytało mi jako 105 i wyświetlało wynik 109,5. dlaczego?//
        System.out.println("It\'s good for begginners? "+goodForBeginners);
    }
}
