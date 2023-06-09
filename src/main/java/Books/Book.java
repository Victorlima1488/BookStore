package Books;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private Boolean published;
    private Double price;
    private Integer Id;
    private String gender;

    public Book(String title, String author, Boolean published, Double price, String gender,Integer id) {
        this.title = title;
        this.author = author;
        this.published = published;
        this.price = price;
        this.gender = gender;
        this.Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", published=" + published +
                ", price=" + price +
                ", Id=" + Id +
                '}';
    }

    @Override
    public int compareTo(Book bookTitle) {
        return this.getTitle().compareToIgnoreCase(bookTitle.getTitle());
    }
}
