
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?");
        int input = scanner.nextInt();
        int sum = 0;

        for (int count = 1; count <= input; count ++ ) {
            sum += count;
        }
        System.out.println("The sum is " + sum);
    }
}