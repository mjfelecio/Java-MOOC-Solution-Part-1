import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Bird> birds;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.birds = new ArrayList<>();
    }

    public void commandHandler() {
        while (true) {
            System.out.print("?");
            String userCommand = scanner.nextLine();

            if (userCommand.equals("Quit")) {
                break;
            }

            switch (userCommand) {
                case "Add":
                    addBird();
                    break;

                case "Observation":
                    birdObservation();
                    break;

                case "All":
                    printAllBirds();
                    break;

                case "One":
                    printOneBird();
                    break;

                default:
                    System.out.println("Invalid command.");
            }
        }
    }

    public void addBird() {
        System.out.print("Name: ");
        String birdName = scanner.nextLine();

        System.out.print("Name in Latin: ");
        String latinBirdName = scanner.nextLine();

        Bird newBird = new Bird(birdName, latinBirdName);
        birds.add(newBird);
    }

    public void birdObservation() {
        System.out.print("Bird? ");
        String observedBird = scanner.nextLine();

        for (Bird bird: birds) {
            if (bird.getName().equals(observedBird)) {
                bird.addObservationCount();
            } else {
                System.out.println("Not a bird!");
            }
        }
    }

    public void printAllBirds() {
        for (Bird bird: birds) {
            System.out.println(bird);
        }
    }

    public void printOneBird() {
        System.out.print("Bird? ");
        String selectedBird = scanner.nextLine();

        for (Bird bird: birds) {
            if (bird.getName().equals(selectedBird)) {
                System.out.println(bird);
            }
        }
    }
    
}
