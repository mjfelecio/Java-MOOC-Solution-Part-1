
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        for (int count = input; count <= 100; count ++ ) {
            System.out.println(count);
        }
    }
}