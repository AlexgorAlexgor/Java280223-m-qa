package JavaProSummaryHomework1;

import java.util.Arrays;

public class JavaSummaryHomework1 {
    public static void main(String[] args) {

        int[] arrayInt = {1, -2, -42, 4, -6, 1, 8,  16,-12, -2, 31, -2, 33};
        int[] arrayInt1 = {-42 ,-12, -6, -2, -2, -2, 1 ,1 ,4 ,8 ,16, 31, 33 };
        int[] arrayInt2 = {-42, -6, -1, 1, 2, 3, 12, 33};

        double[] arrayDouble = {0.96, 2.5, 4.84, 3.7, 1.8, 6.92, 4.2, 2.1, 3.9, 4.76};
        String[] arrayString = {"Apple", "Banana", "Orange", "Apple", "Orange", "Mango"};

        System.out.println("Summary session: JavaPro. Описание задания.");

        System.out.println("#1. Напишите программу на Java, которая находит сумму всех элементов в целочисленном массиве : ");
        System.out.println(Arrays.toString(arrayInt) + " и выводит результат. ");
        SumOfArrayElements sumOfArrayElements = new SumOfArrayElements(arrayInt);

        System.out.println("#2. Напишите программу на Java, которая находит среднее значение всех элементов в массиве с плавающей точкой: ");
        System.out.println(Arrays.toString(arrayDouble) + " и выводит результат. ");
        AverageOfArrayElements averageOfArrayElements = new AverageOfArrayElements(arrayDouble);

        System.out.println("#3.  Напишите программу на Java, которая находит наименьший и наибольший элементы в целочисленном массиве :");
        System.out.println(Arrays.toString(arrayInt) + " и выводит результат. ");
        MinMaxInArray minMaxInArray = new MinMaxInArray(arrayInt);

        System.out.println("#4. Напишите программу на Java, которая находит количество отрицательных элементов в целочисленном массиве :");
        System.out.println(Arrays.toString(arrayInt) + " и выводит результат. ");
        CountNegativeElements countNegativeElements = new CountNegativeElements(arrayInt);

        System.out.println("#5 Напишите программу на Java, которая находит индекс первого вхождения заданного элемента в строковом массиве :");
        System.out.println(Arrays.toString(arrayString) + " и выводит его значение.");
        IndexOfElement indexOfElement = new IndexOfElement(arrayString, "Orange");

        System.out.println("#6 Напишите программу на Java, которая сортирует целочисленный массив :");
        System.out.println(Arrays.toString(arrayInt) + " в порядке возрастания, используя алгоритм сортировки слиянием (merge sort).");
        MergeSort mergeSort = new MergeSort(arrayInt);

        System.out.println("#7 Напишите программу на Java, которая находит наиболее часто встречающийся элемент в целочисленном массиве :");
        System.out.println(Arrays.toString(arrayInt) + " и выводит его значение.");
        MostFrequentElement mostFrequentElement =new MostFrequentElement(arrayInt);

        System.out.println("#8  Напишите программу на Java, которая объединяет два отсортированных целочисленных массива :");
        System.out.println(Arrays.toString(arrayInt1)+ " и ");
        System.out.println( Arrays.toString(arrayInt2) +"в один отсортированный массив, используя алгоритм слияния (merge)..");
        MergeSortedArrays mergeSortedArrays = new MergeSortedArrays(arrayInt1,arrayInt2);

        System.out.println("#9 Напишите программу на Java, которая находит наибольшую возрастающую последовательность в целочисленном массиве :");
        System.out.println(Arrays.toString(arrayInt) + " и выводит его значение.");
LongestIncreasingSequence longestIncreasingSequence= new LongestIncreasingSequence(arrayInt);

        System.out.println("#10 Напишите программу на Java, которая находит пару элементов в целочисленном массиве :");
        System.out.println(Arrays.toString(arrayInt) + " сумма которых равна заданному числу, и выводит их значения.");
        PairWithSum pairWithSum= new PairWithSum(arrayInt, 12);

}
}

