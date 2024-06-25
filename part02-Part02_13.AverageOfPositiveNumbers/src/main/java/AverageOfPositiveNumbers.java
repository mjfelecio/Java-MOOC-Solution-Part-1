
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputCount = 0;
        int sum = 0;
        double positiveAverage = 0;

        while (true){
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0 ) {
                break;
            } else if (input < 0){
                continue;
            } else {
                inputCount ++;
                sum += input;

            }
        }
        if (inputCount > 0) {
            positiveAverage = 1.0 * sum / inputCount;
            System.out.println(positiveAverage);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}