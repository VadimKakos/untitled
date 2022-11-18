package HomeWork;

import java.util.HashSet;
import java.util.Set;

public class Random {

    public static Set<Integer> numbers = new HashSet<>();
    public static void addRan() {
        for (int i = 0; i < 20; i++) {
            int random = (int) (Math.random() * 1000);
            numbers.add(random);
        }
    }
}






