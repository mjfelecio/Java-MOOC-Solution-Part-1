public class Book {
    private String author;
    private String name;
    private int pages;

    public Book (String bookAuthor, String nameOfBook, int numOfPages) {
        this.author = bookAuthor;
        this.name = nameOfBook;
        this.pages = numOfPages;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public int getPages(){
        return this.pages;
    }

    public String toString() {
        return this.author + ", " + this.name + ", " + this.pages + " pages";
    }
}