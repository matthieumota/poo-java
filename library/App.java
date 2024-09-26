package library;

import java.util.Arrays;
import library.items.Book;
import library.items.Library;

class App {
    public static void main(String[] args) {
        Book b = new Book("Harry Potter à l'école des sorciers", 250);
        System.out.println(b.page()); // 1
        b.nextPage(); // tourne la page (ne fait rien si on est sur la dernière page)
        System.out.println(b.page()); // 2
        b.close(); // ferme le livre (reviens à la page 1)
        System.out.println(b.page()); // 1
        System.out.println(b.getName()); // Récupère le nom du livre
        System.out.println(b.countPages()); // Récupère le nombre de pages
        b.nextPage(208);
        System.out.println(b.keepPages()); // Pages restantes
        System.out.println(b.keepPagesInPercent()); // Pages restantes en pourcentage
        System.out.println(b.pagesInPercent()); // Pages totales en pourcentage

        Library l = new Library();
        l.addBook(b); // Ajoute le livre b dans un tableau
        l.addBook(b);
        Book b3 = new Book("Chambre des secrets", 300);
        l.addBooks(Arrays.asList( // Ajoute les livres suivant dans un tableau
            b3,
            new Book("Prisonnier d'Azkaban", 400),
            new Book("Coupe de feu", 500),
            b3
        ));
        // l.books(); // Renvoie le tableau avec tous les livres
        for (Book book : l.books()) {
            System.out.println(book.getName());
        }
        System.out.println(l.count()); // Renvoie le nombre de livre dans la bibliothèque
        System.out.println(l.totalPages()); // Renvoie le nombre de pages de tous les livres
        Book b2 = l.getBook("Coupe de feu"); // Sélectionne le livre "Coupe de feu" s'il existe (l'objet)
        System.out.println(b2.getName());
        // Trouve tous les livres qui commencent par cette lettre (array_filter ?)
        for (Book book : l.findBooksByLetter('C')) {
            System.out.println(book.getName());
        }
        //l.randomBook(); // Sélectionne un livre aléatoire
    }
}
