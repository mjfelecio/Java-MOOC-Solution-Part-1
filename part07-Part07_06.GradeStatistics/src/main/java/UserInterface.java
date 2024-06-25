
import java.util.Scanner;

public class UserInterface {

    private Points points;
    private Scanner scanner;

    public UserInterface(Points points, Scanner scanner) {
        this.points = points;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        System.out.println();
        System.out.println("Point average (all): " + this.points.pointsAverage());
        System.out.println("Point average (passing): " + this.points.passingPointsAverage());
        System.out.println("Pass percentage: " + this.points.percentageOfPassedPoints());

        System.out.println("Grade distribution: ");
        printGradeDistribution();

    }

    public void readPoints() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());

            if (input == -1) {
                break;
            }

            if (!(input < 0 || input > 100)) {
                this.points.addPoints(input);
            }
        }
    }

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = points.gradeDistribution(grade); //checks how many points in that specific grade
            System.out.print(grade + ": ");
            printsStars(stars); // prints the stars based on how many points in that grade range
            System.out.println();

            grade --;
        }
    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }

}
