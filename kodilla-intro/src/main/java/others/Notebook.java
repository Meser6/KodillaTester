package others;

public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("This price is good.");
        } else {
            System.out.println("This notebook is expensive");
        }
    }

    public void prof() {
        if (this.price <= 900 || this.year > 2015) {
            System.out.println("It's good notebook for you");
        } else {
            System.out.println("It isn's good notebook for you");
        }
    }

    public void checkWeigth() {
        if (this.weight < 700) {
            System.out.println("This notebook is very light.");
        } else if (this.weight >= 700 && this.weight <= 1700) {
            System.out.println("This notebook is heavy");
        } else {
            System.out.println("This notebook is very heavy.");

        }
    }
}
