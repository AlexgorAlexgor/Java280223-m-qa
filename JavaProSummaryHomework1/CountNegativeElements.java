package JavaProSummaryHomework1;
public class CountNegativeElements {
    public CountNegativeElements(int[] arr) {

        int[] array = arr;
        int count = 0;
        for (int num : array) {
            if (num < 0) {
                count++;
            }
        }
        System.out.println("Количество отрицательных элементов в целочисленном массиве: " + count);
        System.out.println();
    }
}
