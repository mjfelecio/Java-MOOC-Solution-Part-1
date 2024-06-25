import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private List<Recipe> recipes;

    public UserInterface(Scanner scanner, Recipe recipes) {
        this.scanner = scanner;
        this.recipes = new ArrayList<>();
    }

    public void start() {
        System.out.print("File to read: ");
        String filePath = scanner.nextLine();
        System.out.println();

        readRecipesFromFile(filePath);
        commandHandler();
    }

    public void commandHandler() {
        System.out.println("Commands:\n" +
                "list - lists the recipes\n" +
                "stop - stops the program\n" +
                "find name - searches recipes by name\n" +
                "find cooking time - searches recipes by cooking time\n" +
                "find ingredient - searches recipes by ingredient\n");

        while (true) {
            System.out.print("Enter command: ");
            String userCommand = scanner.nextLine();
            System.out.println();

            if (userCommand.equals("stop")) {
                break;
            }

            switch (userCommand) {
                case "list":
                    listRecipes();
                    break;

                case "find name":
                    findRecipeName();
                    break;

                case "find cooking time":
                    findCookingTime();
                    break;

                case "find ingredient":
                    findRecipeByIngredient();
                    break;

                default:
                    System.out.println("Invalid command.");
            }
        }
    }

    public void readRecipesFromFile(String filePath) {
        List<String> lines;
        try {
            lines = Files.readAllLines(Paths.get(filePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int i = 0;
        // iterates through all lines in the file
        while (i < lines.size()) {
            String recipeName = lines.get(i);
            int cookingTime = Integer.parseInt(lines.get(i + 1));

            List<String[]> ingredients = new ArrayList<>();

            int j;
            // skips the first two lines and stops when empty line is encountered
            for (j = i + 2; j < lines.size() && !lines.get(j).isEmpty(); j++) {
                ingredients.add(lines.get(j).split("\\s+"));
            }

            // adds the content into a recipe instance
            Recipe recipe = new Recipe(recipeName, cookingTime, ingredients);
            recipes.add(recipe);

            //updates the index so that it starts again after the empty space
            //ready to get the next recipe
            i = j + 1;
        }
    }

    public void listRecipes() {
        System.out.println("Recipes: ");

        for (Recipe recipe : recipes) {
            System.out.println(recipe.getRecipeName() + ", cooking time: " + recipe.getCookingTime());
        }
        System.out.println();
    }

    public void findRecipeName() {
        System.out.print("Searched word: ");
        String word = scanner.nextLine();

        System.out.println("Recipes: ");
        for (Recipe recipe: recipes) {
            if (recipe.getRecipeName().contains(word)) {
                System.out.println(recipe.getRecipeName() + ", cooking time: " + recipe.getCookingTime());
            }
        }
        System.out.println();
    }

    public void findCookingTime() {
        System.out.print("Max cooking time: ");
        int time = Integer.parseInt(scanner.nextLine());

        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= time) {
                System.out.println(recipe.getRecipeName() + ", cooking time: " + recipe.getCookingTime());
            }
        }
        System.out.println();
    }

    public void findRecipeByIngredient() {
        System.out.print("Ingredient: ");
        String ingredient = scanner.nextLine();
        System.out.println();

        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            for (String[] ingredients : recipe.getIngredients()) {
                for (String singleIngredient : ingredients) {
                    if (singleIngredient.equals(ingredient)) {
                        System.out.println(recipe.getRecipeName() + ", cooking time: " + recipe.getCookingTime());
                    }
                }
            }
        }

        System.out.println();
    }

}
