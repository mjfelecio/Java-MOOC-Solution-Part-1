
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String userInput = scanner.nextLine();
            String[] splitString = userInput.split(" ");

            for (String i : splitString) {
                if (i.contains("av")) {
                    System.out.println(i);
                }
            }
            if (userInput.equals("")) {
                break;
            }
        }
    }
}
