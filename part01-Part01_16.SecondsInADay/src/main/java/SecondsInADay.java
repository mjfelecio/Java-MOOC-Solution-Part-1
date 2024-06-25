
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

    // Write your program here
    System.out.println("How many days would you like to convert to seconds?");
    int day = Integer.valueOf(scanner.nextInt());

    int hour = 24;
    int min = 60;
    int sec = 60;

    int dayToSec = ((((day*hour)*min)*sec));

    System.out.println(dayToSec);    
    }
}
