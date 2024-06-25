
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int stars = 1; stars <= number; stars ++) {
            System.out.print("*");
        }
            System.out.println();
    }

    public static void printSpaces(int number) {
        for (int space = 1; space <= number; space ++) {
            System.out.print(" ");
            }
    }

    public static void printTriangle(int size) {
        int space = size - 1;
        int stars = 1;
        while (space >= 1) {
            printSpaces(space);
            printStars(stars);
            space --;
            stars++;
        }
        printStars(stars);
    }

    public static void christmasTree(int height) {
        int space = height - 1;
        int stars = 1;
        int base = height - 2;

        while (space >= 1) {
            printSpaces(space);
            printStars(stars);
            space --;
            stars += 2;
        }
        printStars(stars);

        for (int i = 1; i <= 2; i++) {
            printSpaces(base);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
