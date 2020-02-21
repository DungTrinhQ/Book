public class ProgrammingBook extends Book {

    public ProgrammingBook(){
        super();
    }

    public ProgrammingBook(int bookCode, String name, int price, String author, String language) {
        super(bookCode, name, price, author);
    }

    public String language;
    public String frameWork = null;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFrameWork() {
        return frameWork;
    }

    public void setFrameWork(String frameWork) {
        this.frameWork = frameWork;
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
        System.out.println("Nhập ngôn ngữ: ");
        language = input.next();
    }

}
