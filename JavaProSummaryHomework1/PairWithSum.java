package JavaProSummaryHomework1;

import java.util.HashSet;
import java.util.Set;

public class PairWithSum {
    public PairWithSum(int[] arr, int targSum) {

    int[] array = arr;

    int targetSum = targSum;
        Set<Integer> complementSet = new HashSet<>();

        for (int num : array) {
            int complement = targetSum - num;

            if (complementSet.contains(complement)) {
                System.out.println("Пара элементов в целочисленном массиве: (" + num + ") и (" + complement+"), сумма которых равна: "+targetSum);
                break;
            }

            complementSet.add(num);
        }
    }
}
