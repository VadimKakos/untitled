package HomeWork;

import java.util.*;

public class Recipe {

    private final String recipeName;
    private int sum;
    private final static Map<Product, Integer> products = new HashMap();

    public Recipe(String recipeName) {
        this.recipeName = recipeName;
        this.sum = 0;
    }


    public static int salary(Product ob) {
        int sum = 0;
        for (Product key : products.keySet()) {
            sum += products.get(key) * key.getCost();
        }
        return sum;
    }

    public static void addRecipe(Product product) {
        if (products.equals(product)) {
            throw new RuntimeException("Такой продукт уже есть!");
        }
        products.put(product, 1);
    }
    public static void addRecipe(Product product, Integer integer) {
        if (products.equals(product)) {
            throw new RuntimeException("Такой продукт уже есть!");
        }
        products.put(product, integer);
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


    public static Map<Product, Integer> getProducts() {
        return products;
    }
}
