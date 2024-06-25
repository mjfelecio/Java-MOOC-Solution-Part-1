
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Statistics statistics = new Statistics();
        Statistics sumOfEven = new Statistics();
        Statistics sumOfOdd = new Statistics();

        System.out.println("Enter numbers:");

        while (true) {
            int userInput = Integer.parseInt(scanner.nextLine());

            if (userInput == -1) {
                break;
            }

            statistics.addNumber(userInput);
            
            if (userInput % 2 == 0) {
                sumOfEven.addNumber(userInput);
            } else {
                sumOfOdd.addNumber(userInput);
            }
        }
        
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + sumOfEven.sum());
        System.out.println("Sum of odd numbers: " + sumOfOdd.sum());

    }
}