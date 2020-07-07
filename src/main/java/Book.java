public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
    public Book of(String author, String title){

        retu;

        System.out.println("Author: " + author + ", title: " + title);/*TODO Review kdrzazga - Excercise says "Metoda ta ma zwracać
         utworzony obiekt książki" - should return Book, not String*/
    }


    public static void main(String[] args) {
        Book book = new Book("Rowling", "Harry Potter");
    }
}
