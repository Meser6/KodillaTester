public class Book {
    private String author;
    private String title;

    public static String of(String author, String title) {
        return "Author: " + author + ", title: " + title;/*TODO Review kdrzazga - Excercise says "Metoda ta ma zwracać
         utworzony obiekt książki" - should return Book, not String*/
    }


    public static void main(String[] args) {
        Book book = new Book();
        String book1 = Book.of("Rowling", "Harry Potter");
    }
}
