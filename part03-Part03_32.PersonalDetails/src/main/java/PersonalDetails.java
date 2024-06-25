
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int longestWord = 0;
        int years = 0;
        int count = 0;
        String longestName = "";


        while (true) {
            String userInput = scanner.nextLine();

            //breaks the Scanner if Enter is pressed
            if (userInput.isEmpty()) {
                break;
            }
            // splits the string into the name and the birthYear
            String[] splitString = userInput.split(",");

            // stores the splitString into the personalDetails array
            ArrayList<String> personalDetails = new ArrayList<>(Arrays.asList(splitString));

            //determines the longestName
            for (String name : personalDetails) {
                int length = name.length();

                if (length > longestWord) {
                    longestWord = length;
                    longestName = name;
                }
            }



            // Calculates the average of all birthYears inputted
            for (int j = 0; j < personalDetails.size(); j++) {
                years += Integer.parseInt(personalDetails.get(1));
                count ++;
            }



        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of birth years: " + (1.0 * years / count) );

    }
}
