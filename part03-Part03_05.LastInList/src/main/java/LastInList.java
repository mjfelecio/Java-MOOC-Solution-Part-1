
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            numbers.add(number);
        }
        System.out.print("From where? ");
        int start = Integer.valueOf(scanner.nextLine());

        System.out.print("To where? ");
        int end = Integer.valueOf(scanner.nextLine());

        for (;start <= numbers.get(end); start++) {
            System.out.println(numbers.get(start));
            if (start >= end) {
                break;
            }
        }
    }
}