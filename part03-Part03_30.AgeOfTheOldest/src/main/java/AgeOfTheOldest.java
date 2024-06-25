
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.isEmpty()) {
                break;
            }

            String[] splitString = userInput.split(",");

            while (true) {
                int age = Integer.valueOf(splitString[1]);
                if (age > oldest) {
                    oldest = age;

                } break;
            }

        }
        System.out.println("Age of the oldest: " + oldest);
    }
}