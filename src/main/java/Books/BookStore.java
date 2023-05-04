package Books;
import java.awt.*;
import java.util.*;
import java.util.List;
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

    private void stream(String titulo){
        JFrame jFrame = new JFrame(titulo);
        jFrame.setVisible(true);
        jFrame.setSize(250, 250);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        books.forEach((book) -> {
            JLabel label = new JLabel(book.getTitle());
            panel.add(label);
        });

        jFrame.getContentPane().add(panel);
    }

    private void stream(String titulo, String category){
        JFrame jFrame = new JFrame(titulo);
        jFrame.setVisible(true);
        jFrame.setSize(250, 250);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        switch (category) {
            case "1":
                category = "Teologia";
                break;
            case "2":
                category = "Ação e aventura";
                break;
            case "3":
                category = "Literatura";
                break;
            case "4":
                category = "Aventura e ficção";
                break;
        }

        String finalCategory = category;
        books.forEach((book) -> {
            if(book.getGender().equals(finalCategory)){
                JLabel label = new JLabel(book.getTitle());
                panel.add(label);
            }
        });

        jFrame.getContentPane().add(panel);
    }

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

    public void getBookByCategory(String option){
        switch (option) {
            case "1":
               stream("Livros", "1");
                break;
            case "2":
                stream("Livros", "2");
                break;
            case "3":
                stream("Livros", "3");
                break;
            case "4":
                stream("Livros", "4");
                break;
        }
    }

    public void getBooks(){
        sortAlphabetically();
        books.forEach((book) -> System.out.println(book.getTitle()));
        stream("Livros");
    }

    public void buyBook(String title){
        for(Book book: books){
            if(book.getTitle().equals(title)){
                Integer index = books.indexOf(book.getId());
                Double price = book.getPrice();
                String yOrN = JOptionPane.showInputDialog("O livro " + title + " está custando R$:" + price + ". Deseja continuar a compra?");
                if(yOrN.equals("Y")){
                    String cpf = JOptionPane.showInputDialog("Digite seu cpf: ");
                    for(Customers customer: customers){
                        if(customer.getCpf().equals(cpf)){
                            if(customer.getLogin()){
                                JOptionPane.showMessageDialog(null, "Compra confirmada!");
                                setBalance(price);
                                addMyRequest(book.getTitle());
//                                remove(index);
                            }else{
                                JOptionPane.showMessageDialog(null, "Faça o login e tente novamente.");
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

    public void size(){
        System.out.println(books.size());
    }

    private void sortAlphabetically(){
        Collections.sort(books);
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "books=" + books +
                '}';
    }
}
