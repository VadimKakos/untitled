package MultiplicationTable;

import HomeWork.Randomm;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MultiplicationTable {
    private static Set<String> setTask = new HashSet<>();
    static final int COUNT_PUPIL = 15;

    public MultiplicationTable() {
    }

    public static String generatePairNumber() {
        Random ran = new Random();
        int x = ran.nextInt(10);
        int y = ran.nextInt(10);
        return x + "*" + y;
    }

    public static boolean checkTask(String pairNumber) {
        String invertedPairNumber = pairNumber.charAt(2) + "*" + pairNumber.charAt(0);
        for (String task : setTask) {
            if (pairNumber.equals(task) || invertedPairNumber.equals(task)) {
                return true;
            }
        }
        return false;
    }

    public static void generateTask() {
        setTask.add(generatePairNumber());
        while (setTask.size() < COUNT_PUPIL) {
            String pairNumber = generatePairNumber();
            while (checkTask(pairNumber)) {
                pairNumber = generatePairNumber();
            }
            setTask.add(pairNumber);
        }
    }
    public static void main(String[] args) {
        int count = 0;
        while (count < 15) {
            String pairNumber = generatePairNumber();
            String inverseNumber = pairNumber.charAt(2) + "*" + pairNumber.charAt(0);
            if (!setTask.contains(pairNumber) || setTask.contains(inverseNumber)) {
                setTask.add(pairNumber);
                count++;
            }
        }
        System.out.println(setTask);

    }
}
