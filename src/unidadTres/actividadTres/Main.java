package unidadTres.actividadTres;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
         books.add(new Book("1984", "George Orwell", 9.99));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 12.50));
        books.add(new Book("The Hobbit", "J.R.R. Tolkien", 15.75));
        BookFileHandler handler = new BookFileHandler();

        // Save and then read books
        handler.saveBooks(books);
        handler.readBooks();
    }
}
