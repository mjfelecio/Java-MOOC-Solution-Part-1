
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        for (int count = 0; count <= input; count ++ ) {
            System.out.println(count);
        }
    }
}