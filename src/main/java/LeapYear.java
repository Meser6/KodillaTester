public class LeapYear {
    public static void main(String[] args) {
        int year =2034; //tu wpisz rok//
        String yes = "Yes,"+year+" it\'s a leap year";
        String no = "No, "+year+" it isn\'t a leap year ";
        if (year % 4 == 0){
            System.out.println(yes);}
        else if (year % 100 != 0){
            System.out.println(no);}
        /* w algorytmie z kursu jest jeszcze mowa o podzielności przez 400
        *ale nie trzeba pisać tego warunku bo on się zawiera w dwóch poprzednich,
        * a chyba czym mniej skomplikowany kod tym lepiej, dobrze myśle?
         */
        }
}
