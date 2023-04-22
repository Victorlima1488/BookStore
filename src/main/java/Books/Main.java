package Books;

public class Main {

    public static void main(String[] args) {

       BookStore bookStore = new BookStore();

       Book book = new Book("Oração", "Timothy Keller", true, 50.60, "Teologia", 0);
       Book book2 = new Book("Orando com os Salmos", "Dietrich Bonhoffer", true, 30.90, "Teologia", 1);
       Book book3 = new Book("O grande guerreiro", "Victor Lima", false, 15.00, "Teologia", 2);

       Customers victor = new Customers("Victor Ériko de Lima Maciel", "M", "limaeriko48@gmail.com", "Cagepa1037", "10481742476", 23);
       Customers Neto = new Customers("Neto Maciel", "M", "netomaciel48@gmail.com", "Suelyy123", "10481741402",20);
       Customers Gaby = new Customers("Gabrielly Brasileiro", "F", "GabriellyBasileiro@gmail.com", "Deus1234", "12345678902", 25);
       bookStore.add(book);
       bookStore.add(book2);
       bookStore.add(book3);

       bookStore.addCustomers(victor);
       bookStore.addCustomers(Neto);
       bookStore.addCustomers(Gaby);

       bookStore.login("netomaciel48@gmail.com", "Suelyy123");
       bookStore.login("limaeriko48@gmail.com", "Cagepa1037");

       bookStore.buyBook("Oração");

       bookStore.getBooks();

       System.out.println(bookStore.getGalance());
    }
}
