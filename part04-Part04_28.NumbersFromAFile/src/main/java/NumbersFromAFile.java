
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        System.out.print("File? ");
        String file = scanner.nextLine();

        System.out.print("Lower bound? ");
        int lowerBound = Integer.parseInt(scanner.nextLine());

        System.out.print("Upper bound? ");
        int upperBound = Integer.parseInt(scanner.nextLine());


        try (Scanner fileScanner = new Scanner(Paths.get(file))) {

            while (fileScanner.hasNextLine()) {
                int numbers = Integer.parseInt(fileScanner.nextLine());
                if (numbers >= lowerBound && numbers <= upperBound) {
                        count++;
                }
            }
        } catch (Exception e) {
            System.out.println("File " + file + " not found.");
        }
        System.out.println("Numbers: " + count);
    }

}
