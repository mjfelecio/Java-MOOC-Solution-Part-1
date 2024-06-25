import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("First: 0/100");
        System.out.println("Second: 0/100");

        int first = 0;
        int second = 0;


        while (true) {
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);


            switch (command) {
                case "add":
                    if (amount < 0) {
                        break;
                    } else if (first + amount <= 100) {
                        first += amount;
                    } else {
                        first = 100;
                    }
                    break;

                case "move":

                    if (amount >= first) {
                        second += first;
                        first = 0;

                    } else {
                        second += amount;
                        first -= amount;
                    }

                    if (second > 100) {
                        second = 100;
                    }
                    break;

                case "remove":
                    if (amount > second) {
                        second = 0;
                    } else {
                        second -= amount;
                    }
                    break;

                default: System.out.println("Invalid command.");

            }


            System.out.println();
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

        }
    }
}



