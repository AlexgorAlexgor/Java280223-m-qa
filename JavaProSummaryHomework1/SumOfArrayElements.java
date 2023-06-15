package JavaProSummaryHomework1;

import java.util.Arrays;

public class SumOfArrayElements {
    // private int[] arr;
    public SumOfArrayElements(int[] arr) {
        int[] array = arr;
        int sum = 0;

        for (int num : arr) {
            sum += num ;
        }
            System.out.println("Сумма всех элементов в целочисленном массиве : " + sum);
        System.out.println();

    }
}