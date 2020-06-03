public class SimpleArray {
    public static void main(String[] args) {
            String[] name = new String[6];
            name[0] = "Damian";
            name[1] = "Kuba";
            name[2] = "Piotr";
            name[3] = "Gosia";
            name[4] = "Beata";
            name[5] = "Robert";

        String names = name[3];
        System.out.println(names);

        int numberOfElements = name.length;
        System.out.println("Moja tablica zawiera "+numberOfElements+" elementów");
    }
}
