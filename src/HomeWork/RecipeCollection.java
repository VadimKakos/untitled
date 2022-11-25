package HomeWork;

import java.util.HashSet;
import java.util.Set;

public class RecipeCollection {
    public static Set<Recipe> recipes = new HashSet<>();

    public static void addRecipe(Recipe recipe) {
        for (Recipe recipe1 : recipes) {
            if (recipes.contains(recipe1.getRecipeName())) {
                throw new RuntimeException("Такой рецепт уже есть!");
            }
        }
        recipes.add(recipe);
    }
}
