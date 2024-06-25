import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.print("Publication Year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, pages, publicationYear));
        }

        System.out.println();
        System.out.println("What information will be printed? ");
        String bookInfo = scanner.nextLine();

        for (Book book: books) {
            if (bookInfo.equals("everything")) {
                System.out.println(book);
            } else if (bookInfo.equals("name")) {
                System.out.println(book.getTitle());
            }
        }

    }
}