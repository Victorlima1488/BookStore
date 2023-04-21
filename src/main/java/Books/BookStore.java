package Books;
import java.util.*;
public class BookStore {

    List<Book> books = new ArrayList<>();

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

    @Override
    public String toString() {
        return "BookStore{" +
                "books=" + books +
                '}';
    }
}
