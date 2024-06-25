
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int firstNum = scanner.nextInt();
        System.out.println("Last number?");
        int secondNum = scanner.nextInt();
        int sum = 0;

        for (; firstNum <= secondNum; firstNum ++ ) {
            sum += firstNum;
        }
        System.out.println("The sum is " + sum);
    }
}