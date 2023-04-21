package Books;

public class Main {

    public static void main(String[] args) {

       BookStore bookStore = new BookStore();

       Book book = new Book("Oração", "Timothy Keller", true, 50.60, 0);
       Book book2 = new Book("Orando com os Salmos", "Dietrich Bonhoffer", true, 30.90, 1);
       Book book3 = new Book("O grande guerreiro", "Victor Lima", false, 15.00, 2);

       Customers customers = new Customers("Victor Ériko de Lima Maciel", "M", "limaeriko48@gmail.com", "Cagepa1037", "10481742476", 23);

       bookStore.add(book);
       bookStore.add(book2);
       bookStore.add(book3);

       bookStore.getBooks();

       bookStore.size();

       bookStore.sortAlphabetically();

       bookStore.getBooks();

       bookStore.addCustomers(customers);

       bookStore.getCustomers();
    }
}
