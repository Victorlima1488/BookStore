package Books;

import javax.swing.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

       BookStore bookStore = new BookStore();
       Scanner input = new Scanner(System.in);

       String option;
       do {
          option = JOptionPane.showInputDialog("Escolha uma das opções abaixo: " +
                  "\n1 - Ver lista de livros\n2 - Comprar livros\n3 - Ver seu carrinho\n4 - Favoritos\n 5 - Sair");

          switch (option){
             case "1":

                break;

             case "2":

               break;

             case "3":

               break;

             case "4":

                break;
          }
       } while (!option.equals("5"));



//       Book book = new Book("Oração", "Timothy Keller", true, 50.60, "Teologia", 0);
//       Book book2 = new Book("Orando com os Salmos", "Dietrich Bonhoffer", true, 30.90, "Teologia", 1);
//       Book book3 = new Book("O grande guerreiro", "Victor Lima", false, 15.00, "Ação e aventura", 2);
//       Book book4 = new Book("A Revolução dos Bichos", "George Orwell ", true, 13.99, "Literatura", 3);
//       Book book5 = new Book("O pequeno príncipe", "Antoine de Saint-Exupéry", true, 13.99, "Aventura e ficção", 4);
//
//       Customers victor = new Customers("Victor Ériko de Lima Maciel", "M", "limaeriko48@gmail.com", "Cagepa1037", "10481742476", 23, 0);
//       Customers Neto = new Customers("Neto Maciel", "M", "netomaciel48@gmail.com", "Suelyy123", "10481741402",20, 0);
//       Customers Gaby = new Customers("Gabrielly Brasileiro", "F", "GabriellyBasileiro@gmail.com", "Deus1234", "12345678902", 25, 0);
//       bookStore.add(book);
//       bookStore.add(book2);
//       bookStore.add(book3);
//       bookStore.add(book4);
//       bookStore.add(book5);
//
//       bookStore.addCustomers(victor);
//       bookStore.addCustomers(Neto);
//       bookStore.addCustomers(Gaby);
//
//       bookStore.login("limaeriko48@gmail.com", "Cagepa1037");
//
//       bookStore.buyBook("Oração");
//
////       bookStore.getBooks();
//
//       bookStore.getPoints("10481742476");

//       bookStore.getBooksFilteredByPrice(20d);

//       bookStore.allTitles();
    }

}
