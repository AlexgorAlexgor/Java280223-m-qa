package JavaProSummaryHomework1;
public class MergeSort {
    public MergeSort(int[] arr) {


        int[] array = arr;

        System.out.println("Несортированный целочисленный массив :");
        printArray(array);

        mergeSort(array, 0, array.length - 1);

        System.out.println("Сортированный  целочисленный массив :");
        printArray(array);
        System.out.println();

    }
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            merge(array, left, middle, right);
        }
    }

    public static void merge(int[] array, int left, int middle, int right) {
        int[] temp = new int[right - left + 1];

        int i = left;
        int j = middle + 1;
        int k = 0;

        while (i <= middle && j <= right) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        while (i <= middle) {
            temp[k++] = array[i++];
        }

        while (j <= right) {
            temp[k++] = array[j++];
        }

        for (int p = 0; p < temp.length; p++) {
            array[left + p] = temp[p];
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
