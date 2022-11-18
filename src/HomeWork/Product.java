package HomeWork;

import java.util.Objects;

public class Product {
    private final String name;
    private final int cost;
    private final int count;


    public Product(String name, int cost, int count) {
        this.count = count;
        if (name != null && !name.isBlank() && !name.isEmpty() && cost > 1) {
            this.name = name;
            this.cost = cost;
            ProductList.addProduct(this);
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return cost == product.cost && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }

    @Override
    public String toString() {
        return "Товар " + name + " Цена " + cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getCount() {
        return count;
    }



}
