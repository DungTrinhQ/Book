import java.util.Scanner;

public class Book {
    Scanner input = new Scanner(System.in);
    protected int bookCode;
    protected String name;
    protected int price;
    protected String author;


    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(){
        super();
    }

    public Book(int bookCode, String name, int price, String author){
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public void addBook() {
        System.out.println("Nhập mã sách: ");
        bookCode = input.nextInt();
        System.out.println("Nhập tên sách: ");
        name = input.next();
        System.out.println("Nhập đơn giá: ");
        price = input.nextInt();
        System.out.println("Nhập tên tác giả: ");
        author = input.next();
    }
}
