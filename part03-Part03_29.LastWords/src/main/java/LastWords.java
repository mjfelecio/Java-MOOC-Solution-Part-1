
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();
            String[] splitString = userInput.split(" ");

            System.out.println(splitString[splitString.length - 1]);
            if (userInput.equals("")) {
                break;
            }
        }
    }
}
