
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String oldestName = "";

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
                    oldestName = splitString[0];
                }
                break;
            }

        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
