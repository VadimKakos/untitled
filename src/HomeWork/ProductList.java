package HomeWork;

import java.util.HashSet;
import java.util.Set;

public class ProductList {
    public static Set<Product> productList = new HashSet<>();

    public static void addProduct(Product product) {
        if (productList.contains(product)) {
            throw new RuntimeException("Такой продукт уже есть!");
        }
        productList.add(product);
    }

    public static void printInfo() {
        for (Product product : productList) {
            System.out.println(product.getName() + product.getCost());
        }
    }

    public static void checkList(String check) {
        for (Product product : productList) {
            if (product.getName().equals(check)) {
                System.out.println("Такой товар уже куплен");
            }
        }
    }

    public static void remove(String remove) {
        for (Product product : productList) {
            if (product.getName().equals(remove)) productList.remove(product);
        }
    }

    public static Set<Product> getProductList() {
        return productList;
    }
}
