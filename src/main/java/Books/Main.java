package Books;
import java.util.*;

public class Main {

    public static void main(String[] args) {

       Book book = new Book("Oração", "Timothy Keller", true, 50.60, 0);
       Book book2 = new Book("Orando com os Salmos", "Dietrich Bonhoffer", true, 30.90, 1);
       Book book3 = new Book("O grande guerreiro", "Victor Lima", false, 15.00, 2);

       BookStore bookStore = new BookStore();

       bookStore.add(book);
       bookStore.add(book2);
       bookStore.add(book3);

       bookStore.getBooks();

       bookStore.size();

        System.out.println(bookStore.isEmpty());

        bookStore.changePrice(1, 20.00);

        bookStore.getBooks();

        bookStore.remove(2);

        bookStore.getBooks();
    }
}
