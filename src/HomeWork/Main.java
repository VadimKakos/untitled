package HomeWork;

import Passport.Passport;

import java.util.HashSet;
import java.util.Set;

import static MultiplicationTable.MultiplicationTable.generatePairNumber;

public class Main {
    public static void main(String[] args) {


        Product product = new Product("банан", 200, 1);
        Product product1 = new Product("ananas", 100, 1);
        Product product2 = new Product("chek", 300, 1);
        System.out.println(product);
        ProductList.printInfo();
        ProductList.checkList("банан");


        Recipe.addRecipe(product);
        Recipe.addRecipe(product1);
        System.out.println(Recipe.getProducts());

        Set<Integer> numbers = new HashSet<>();
            for (int i = 0; i < 20; i++) {
                int random = (int) (Math.random() * 1000);
                numbers.add(random);
            }

        Passport.addNewPassport(new Passport(000000, "Иван", "Иванович", "20.12.2022"));

            //task4

        //3. HeshSet Потому что доступ к ячейке памяти с известным адресом очевидно быстрее обхода дерева
    }
}
