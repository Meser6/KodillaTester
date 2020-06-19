public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2015);

        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        Notebook heavyNotebook = new Notebook(2000, 1500, 2018);
        notebook.checkPrice();
        notebook.prof();
        notebook.checkWeigth();
        System.out.println(heavyNotebook.weight+ " " + heavyNotebook.price + " " + notebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.prof();
        heavyNotebook.checkWeigth();
        Notebook oldNotebook = new Notebook(1600, 500, 2010);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + notebook.year);
        oldNotebook.checkPrice();
        oldNotebook.prof();
        oldNotebook.checkWeigth();


    }
}