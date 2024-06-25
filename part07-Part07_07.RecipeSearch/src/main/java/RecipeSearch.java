import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args)  {

        UserInterface ui = new UserInterface(new Scanner(System.in), new Recipe());

        ui.start();
    }

}
