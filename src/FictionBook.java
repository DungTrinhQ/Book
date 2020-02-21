public class FictionBook extends Book {
    public FictionBook(){
        super();
    }
    public FictionBook(int bookCode, String name, int price, String author) {
        super(bookCode, name, price, author);
    }

    public String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}
