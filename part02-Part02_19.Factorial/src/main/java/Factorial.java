
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number:");
        int input = scanner.nextInt();
        int factorial = 1;

        for (int count = 1; count <= input; count ++ ) {
            factorial *= count;
            System.out.println(count);
        }
        System.out.println("Factorial: " + factorial);
    }
}