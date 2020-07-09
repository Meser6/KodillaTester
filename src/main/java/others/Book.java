package others;

public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
    public static Book of(String author, String title){
        Book book1 = new Book(author, title);
        return book1;
    }


    public static void main(String[] args) {

        Book book = new Book("Rowling", "Harry Potter");
        Book book1 = of("X", "y");
    }
}
