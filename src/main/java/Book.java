public class Book {
    private String author;
    private String title;

    public static String of(String author, String title) {
        return "Author: " + author + ", title: " + title;
    }

    public static void main(String[] args) {
        Book book = new Book();
        String book1 = Book.of("Rowling", "Harry Potter");
    }
}
