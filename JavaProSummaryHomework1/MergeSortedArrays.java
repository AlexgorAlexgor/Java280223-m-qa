package JavaProSummaryHomework1;
public class MergeSortedArrays {
    public MergeSortedArrays(int[] arr1, int[] arr2) {


    int[] array1 = arr1;
        int[] array2 = arr2;

        int[] mergedArray = mergeArrays(array1, array2);

        System.out.println("Объединенный отсортированный массив:");
        printArray(mergedArray);
        System.out.println();
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        while (i < array1.length) {
            mergedArray[k++] = array1[i++];
        }

        while (j < array2.length) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
