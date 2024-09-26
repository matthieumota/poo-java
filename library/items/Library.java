package library.items;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<Book>();

    public Library addBook(Book b) {
        if (this.books.contains(b)) {
            return this;
        }

        this.books.add(b);

        return this;
    }

    public Library addBooks(List<Book> bs) {
        bs.forEach(b -> this.addBook(b));

        return this;
    }
    
    public List<Book> books() {
        return this.books;
    }

    public int count() {
        return this.books.size();
    }

    public int totalPages() {
        int total = 0;

        for (Book book : this.books) {
            total += book.countPages();
        }

        return total;
    }

    public Book getBook(String n) {
        for (Book book : this.books) {
            if (book.getName() == n) {
                return book;
            }
        }

        return null;
    }

    public List<Book> findBooksByLetter(Character n) {
        List<Book> filtered = new ArrayList<Book>();

        for (Book book : this.books) {
            if (book.getName().charAt(0) == n) {
                filtered.add(book);
            }
        }

        return filtered;
    }
}
