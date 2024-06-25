import java.util.List;

public class Recipe {
    private String recipeName;
    private int cookingTime;
    private List<String[]> ingredients;

    public Recipe(String name, int cookingTime, List<String[]> ingredients) {
        this.recipeName = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    public Recipe() {
    }

    public String getRecipeName() {
        return this.recipeName;
    }

    public int getCookingTime() {
        return this.cookingTime;
    }

    public List<String[]> getIngredients() {
        return this.ingredients;
    }
}