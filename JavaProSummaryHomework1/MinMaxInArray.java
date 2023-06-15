package JavaProSummaryHomework1;
public class MinMaxInArray {
    public MinMaxInArray(int[] arr) {
       // this.array = array;

    int [] array = arr;
        int min = array[0];
        int max = array[0];

    for (int i=1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

            if (array[i] > max) {
                max = array[i];
            }
        }System.out.println("наименьший : (" + min+ ") и наибольший :( " + max+ " )элементы в целочисленном массиве" );
        System.out.println();
    }

}