package JavaProSummaryHomework1;

public class LongestIncreasingSequence {
    public LongestIncreasingSequence(int[] arr) {


    int[] array = arr;

        int maxLength = 1;
        int currentLength = 1;
        int endIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    endIndex = i - 1;
                }
                currentLength = 1;
            }
        }

        if (currentLength > maxLength) {
            maxLength = currentLength;
            endIndex = array.length - 1;
        }

        int startIndex = endIndex - maxLength + 1;

        System.out.println("Наибольшая возрастающая последовательность в целочисленном массиве:");
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
