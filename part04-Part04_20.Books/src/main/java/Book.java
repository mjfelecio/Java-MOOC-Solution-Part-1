public class Book {
    private String title;
    private int pages;
    private int year;

    public Book (String bookTitle, int numOfPages, int publicationYear){
        this.title = bookTitle;
        this.pages = numOfPages;
        this.year = publicationYear;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    public int getPublicationYear() {
        return this.year;
    }

    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.year;
    }
}
