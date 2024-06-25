
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");

        int input = 0;
        int sum = 0;
        int numCount = 0;
        int evenNum = 0;
        int oddNum = 0;

        while (input != -1 ) {
            input = scanner.nextInt();

            if (input == -1) {
                System.out.println("Thx! Bye!");
            }

            sum += input;
            numCount ++;

            if (input % 2 == 0) {
                evenNum ++;
            } else {
                oddNum ++;
            }

            input = scanner.nextInt();

        }
        System.out.println("Thx! Bye!");

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numCount);
        System.out.println("Average: " +  (1.0 * sum / numCount));
        System.out.println("Even: " + evenNum);
        System.out.println("Odd: " + oddNum);

    }
}