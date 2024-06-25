
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("First: 0/100");
        System.out.println("Second: 0/100");

        Container firstContainer = new Container();
        Container secondContainer = new Container();

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
                    firstContainer.add(amount);
                    break;

                case "move":
                    if (firstContainer.contains() < amount) {
                        secondContainer.add(firstContainer.contains());
                        firstContainer.remove(amount);
                    } else if (firstContainer.contains() != 0) {
                        secondContainer.add(amount);
                        firstContainer.remove(amount);
                    }
                    break;


                case "remove":
                    secondContainer.remove(amount);
                    break;

                default: System.out.println("Invalid command.");

            }


            System.out.println();
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

        }
    }

}
