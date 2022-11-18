package HomeWork;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {

    private final String recipeName;
    private int sum;
    private final static Set<Product> products = new HashSet<Product>();

    public Recipe(String recipeName) {
        this.recipeName = recipeName;
        this.sum = 0;
    }

    public static void addRecipe(Product product) {
        if (products.contains(product)) {
            throw new RuntimeException("Такой продукт уже есть!");
        }
        products.add(product);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return sum == recipe.sum && Objects.equals(recipeName, recipe.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeName, sum);
    }

    @Override
    public String toString() {
        return "Название рецепта " + recipeName +
                " стоимость " + sum;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public int getSum() {
        return sum;
    }

    public static Set<Product> getProducts() {
        return products;
    }
}
