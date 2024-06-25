
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String names = scanner.nextLine();

            items.add(new Item(names));

            if (names.isEmpty()) {
                break;
            }

            System.out.println(items);
        }
    }
}
