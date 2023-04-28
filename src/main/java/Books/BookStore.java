package Books;
import java.util.*;
import java.util.stream.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.*;

public class BookStore {
    Book book;
    Customers customer;
    Double balance = 0.0;
    List<Book> books = new ArrayList<>();
    Set<Customers> customers = new HashSet<>();
    Map<String, String> myRequests = new HashMap<>();

    public Double getBalance(){
        return this.balance;
    }

    public void setBalance(Double balance){
        this.balance += balance;
    }

    public void addCustomers(Customers newCustomers){
        customers.add(newCustomers);
    }

    public void allTitles(){
        Stream<String> stream = books.stream().map(b -> b.getTitle());
        stream.forEach(System.out::println);
    }

    public void getCustomers(){
        for(Customers customer: customers) System.out.println(customer);
    }

    public Boolean login(String email, String senha){
        for(Customers customer: customers){
            if(customer.getEmail().equals(email) && customer.getSenha().equals(senha)){
                System.out.println("Login realizado com sucesso!");
                customer.setLogin(true);
                return true;
            }
        }
        System.out.println("Credenciais erradas.");
        return false;
    }

    public void getbookByCategory(String option){
        if(option.equals("a")){
            for(Book book: books){
                if(book.getGender().equals("Teologia")){
                    System.out.println(book);
                }
            }
        }else if(option.equals("b")){
            for(Book book: books){
                if(book.getGender().equals("Ação e aventura")){
                    System.out.println(book);
                }
            }
        }else{
            for(Book book: books){
                if(book.getGender().equals("Ação e aventura")){
                    System.out.println(book);
                }
            }
        }
    }

    public void buyBook(String title){
        for(Book book: books){
            if(book.getTitle().equals(title)){
                System.out.println("O livro " + title + " está custando R$:" + book.getPrice() + ". \nDeseja confirmar a compra? (Y/N)");
                Integer index = books.indexOf(book.getId());
                Double price = book.getPrice();
                String yOrN = JOptionPane.showInputDialog("Deseja comprar um livro?");
                if(yOrN.equals("Y")){
                    String cpf = JOptionPane.showInputDialog("Digite seu cpf");
                    for(Customers customer: customers){
                        if(customer.getCpf().equals(cpf)){
                            if(customer.getLogin()){
                                JOptionPane.showMessageDialog(null, "Compra confirmada!");
                                setBalance(price);
                                addMyRequest(book.getTitle());
//                                remove(index);
                            }else{
                                System.out.println("Faça login e tente novamente.");
                            }
                        }
                    }
                }
            }
        }
    }

    public void myRequest(String date){
        for(Map.Entry<String, String> entry: myRequests.entrySet()){
            if(entry.getValue().equals(date)){
                System.out.println(entry.getKey());
            }
        }
    }

    public void addMyRequest(String book){
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = currentDate.format(formatter);
        myRequests.put(book, formattedDate);
        System.out.println(myRequests);
    }

    public void getPoints(String cpf){
        customers.forEach(c -> {
            if(c.getCpf().equals(cpf)) System.out.println(c.getPoints());
        });
    }

    public void getBooksFilteredByPrice(Double num){
        Stream<Book> stream = books.stream().filter(c -> c.getPrice() > num);
        stream.forEach(System.out::println);
    }

    public Boolean isEmpty(){
        return books.size() == 0 ? true : false;
    }

    public void add(Book newBook){
        books.add(newBook);
    }

    private int indexOf(Integer id){
        for(Book book: books){
            if(book.getId() == id){
                return books.indexOf(book);
            }
        }
        return 0;
    }

    public void remove(Integer id){
        int index = indexOf(id);
        books.remove(index);
    }

    public void changePrice(Integer id, Double newPrice){
        for(Book book: books){
            if(book.getId() == id){
                book.setPrice(newPrice);
            }
        }
    }

    public void getBooks(){
        for(Book book: books) System.out.println(book);
    }

    public void size(){
        System.out.println(books.size());
    }

    public void sortAlphabetically(){
        Collections.sort(books);
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "books=" + books +
                '}';
    }
}
