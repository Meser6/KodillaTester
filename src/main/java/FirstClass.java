public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("600g", 1000, 2015);

        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        Notebook heavyNotebook = new Notebook("2000g", 1500, 2018);
        notebook.checkPrice();
        notebook.prof();
        System.out.println(heavyNotebook.weight+ " " + heavyNotebook.price + " " + notebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.prof();
        Notebook oldNotebook = new Notebook("1600g", 500, 2010);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + notebook.year);
        oldNotebook.checkPrice();
        oldNotebook.prof();


    }
}