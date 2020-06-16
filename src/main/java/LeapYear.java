public class LeapYear {
    public static void main(String[] args) {
        int year = 1999; //tu wpisz rok//
        isLeap(year);
        dupa();
    }

    private static void isLeap(int year) {
        String yes = "Yes," + year + " it's a leap year";
        String no = "No, " + year + " it isn't a leap year ";
        if (year % 4 == 0) {
            System.out.println(yes);
        } else if (year % 100 != 0) {
            System.out.println(no);
        }
    }
    private static void dupa(){
        System.out.println("ok");
    }
}
